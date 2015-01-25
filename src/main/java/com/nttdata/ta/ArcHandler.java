/**
 * 
 */
package com.nttdata.ta;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 * @author oliverkoeth
 *
 */
public class ArcHandler {
	
	static class MethodPosition implements Comparable<ArcHandler.MethodPosition>{
		private int line;
		private String fullName;
		private boolean isDefinition;
		public int getLine() { return line; }
		public String getFullName() { return fullName; }
		
		public MethodPosition (int line, String fullName, boolean isDefinition) {
			this.line = line;
			this.fullName = fullName;
			this.isDefinition = isDefinition;
		}

		@Override
		public int compareTo(ArcHandler.MethodPosition otherPosition) {
		    if (line == otherPosition.getLine()) {
		      return 0;
		    }
		    if (line < otherPosition.getLine()) {
		      return -1;
		    }
		    
		    return 1;
		}		
	}
		
	private SortedSet<String> arcs = null;
	private SortedSet<String> treeArcs = null;
	private SortedSet<String> treeNodes = null;

	public void initArcs() {
		arcs = new TreeSet<String>();
	}
	public void printArcs() throws Exception {
		printArcs(null, arcs);
	}
	private String printArcs(String fileName, SortedSet<String> printArcs) throws Exception {
		String fullFileName = null;
		if (fileName!=null) {
			// Write file in dot language
			System.out.println("INFO: Number of nodes: "+treeNodes.size());
			System.out.println("INFO: Number of arcs: "+treeArcs.size());
			int complexity = treeArcs.size()*treeNodes.size();
			System.out.println("INFO: Complexity: "+complexity);
			fullFileName = fileName+"-"+complexity+".gv";
			Path path = Paths.get(fullFileName);
		    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){
		    	writer.write("digraph G {");
		    	writer.newLine();
				for (String arc : printArcs) {
					writer.write(arc+";");
			    	writer.newLine();
				}
				writer.write("}");
		    	writer.newLine();
		    }		
		}
		// Doppelt genäht hält besser
		System.out.println("digraph G {");
		for (String arc : printArcs) {
			System.out.println(arc+";");
		}
		System.out.println("}");
		
		return fullFileName;
	}
	
	private void initTreeArcs() {
		treeArcs = new TreeSet<String>();
		treeNodes = new TreeSet<String>();
	}
	private void buildForestArcs(String className) {
		for (String arc : arcs) {
			if (getFromNode(arc).startsWith(className+"_") && !treeArcs.contains(arc)) {
				treeArcs.add(arc);
				buildTreeArcs(getToNode(arc));
			}
		}
	}
	private void buildTreeArcs(String nodeName) {
		treeNodes.add(nodeName);
		for (String arc : arcs) {
			if (getFromNode(arc).equals(nodeName) && !treeArcs.contains(arc)) {
				treeArcs.add(arc);
				buildTreeArcs(getToNode(arc));
			}
		}
	}
	private String getFromNode(String arc) {
		StringTokenizer stringTokenizer = new StringTokenizer(arc);
		String fromNode = stringTokenizer.nextToken(); 
		return fromNode;
	}
	private String getToNode(String arc) {
		StringTokenizer stringTokenizer = new StringTokenizer(arc);
		stringTokenizer.nextToken(); // Skip
		stringTokenizer.nextToken(); // Skip
		String toNode = stringTokenizer.nextToken(); 
		return toNode;
	}
	public void printArcsAsTree(String baseFileName, String nodeName) throws Exception {
		System.out.println("INFO: Print Arcs as Tree to "+baseFileName);
		initTreeArcs();
		buildTreeArcs(nodeName);
		String fullFileName = printArcs(baseFileName, treeArcs);
		Runtime.getRuntime().exec("c:/dev-graphviz-2.38/bin/dot -Tpdf "+fullFileName+" -o "+fullFileName+".pdf");
	}
	public void printArcsAsForest(String baseFileName, String className) throws Exception {
		System.out.println("INFO: Print Arcs as Forest to "+baseFileName);
		initTreeArcs();
		buildForestArcs(className);
		String fullFileName = printArcs(baseFileName, treeArcs);
		Runtime.getRuntime().exec("c:/dev-graphviz-2.38/bin/dot -Tpdf "+fullFileName+" -o "+fullFileName+".pdf");
	}
	public void addArcs(List<MethodPosition> items) {
		// Blacklist
		SortedSet<String> blackset = new TreeSet<String>();
		blackset.add("CMap_");
		
		// Build arcs w/o dups and blacklist
		Collections.sort(items);
		String currentDef = null;
		for (MethodPosition item : items) {
			if (item.isDefinition) {
				currentDef = item.getFullName();
			}
			else {
				boolean skip = false;
				for (String blackItem : blackset) {
					if (item.getFullName().startsWith(blackItem)) {
						skip = true;
						break;
					}					
				}
				if (!skip) {
					arcs.add(currentDef+" -> "+item.getFullName());
				}
			}
		}		
	}
}
