package com.nttdata.ta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.nttdata.sf.tooling.ApexClass;
import com.nttdata.sf.tooling.ApexClassMember;
import com.nttdata.sf.tooling.ApexTrigger;
import com.nttdata.sf.tooling.ApexTriggerMember;
import com.nttdata.sf.tooling.Constructor;
import com.nttdata.sf.tooling.ContainerAsyncRequest;
import com.nttdata.sf.tooling.DeleteResult;
import com.nttdata.sf.tooling.Error;
import com.nttdata.sf.tooling.ExternalMethod;
import com.nttdata.sf.tooling.ExternalReference;
import com.nttdata.sf.tooling.MetadataContainer;
import com.nttdata.sf.tooling.Method;
import com.nttdata.sf.tooling.ObjectFactory;
import com.nttdata.sf.tooling.Position;
import com.nttdata.sf.tooling.SaveResult;
import com.nttdata.sf.tooling.SymbolTable;

public class ApexClassAnalyser {
	final private static String METADATA_CONTAINER_NAME="ApexClassAnalyser";
	final private static String BASE_CLASS_OUTPUT_DIR="C:/temp/apex-class-analyser/";
	final private static String BASE_TRIGGER_OUTPUT_DIR="C:/temp/apex-trigger-analyser/";
		
	private ObjectFactory objectFactory = new ObjectFactory();
	private String metadataContainerId;
	private ArcHandler arcHandler = new ArcHandler();
	private LinkedList<String> newDependencies = null;
	private LinkedList<String> allDependencies = null;
	private int numOfCompiles=0;
	
	public void initDependencies() {
		newDependencies = new LinkedList<String>();
		allDependencies = new LinkedList<String>();
	}

	public void printDependencies() {
		System.out.println("Dependencies {");
		for (String dependency : allDependencies) {
			System.out.println(dependency+";");
		}
		System.out.println("}");
	}

	public int getNumOfCompiles() {		
		return numOfCompiles;
	}

	public void deleteMetadataContainer () {
		System.out.println("INFO: Delete Metadata Container "+METADATA_CONTAINER_NAME);
		MetadataContainer[] containers =
				ToolingDriver.getPort().query("select Id, Name from MetadataContainer where Name = '"+METADATA_CONTAINER_NAME+"'")
		        .getRecords().toArray(new MetadataContainer[0]);    		
		System.out.println("INFO: Delete Metadata Container "+containers.length);
		if(containers.length>0) {
			System.out.println("INFO: Delete Metadata Container "+containers[0].getId());
			List<DeleteResult> results = ToolingDriver.getPort().delete(Arrays.asList(containers[0].getId()));
			for (DeleteResult result : results) {
				for (Error error : result.getErrors()) {
					System.out.println("ERROR: "+error.getMessage());
				}
			}
		}
	}
	
	private String createMetadataContainer () {
		System.out.println("INFO: Create Metadata Container "+METADATA_CONTAINER_NAME);
		MetadataContainer container = new MetadataContainer();
		container.setName(objectFactory.createMetadataContainerName(METADATA_CONTAINER_NAME));
		
		List<SaveResult> saveResult = ToolingDriver.createObject(container);
		String metadataContainerId = saveResult.get(0).getId();
		System.out.println("INFO: Metadata Container created "+metadataContainerId);
		
		return metadataContainerId;
	}
	
	private String getMetadataContainerId() {
		System.out.println("INFO: Metadata Container Id from Name "+METADATA_CONTAINER_NAME);
		if (metadataContainerId != null) {
			return metadataContainerId;
		}
		
		MetadataContainer[] metadataContainers =
				ToolingDriver.getPort().query("select Id, Name from MetadataContainer where Name = '"+METADATA_CONTAINER_NAME+"'")
			        .getRecords().toArray(new MetadataContainer[0]);    		
		
		if (metadataContainers.length == 0) {
			metadataContainerId = createMetadataContainer();
		}
		else {
			metadataContainerId = metadataContainers[0].getId();
		}
		
		return metadataContainerId;
	}

	private void compileMetadataContainer () throws Exception {		
		System.out.println("INFO: Compile Metadata Container");
		ContainerAsyncRequest request = new ContainerAsyncRequest();		
	    request.setIsCheckOnly(
	    		objectFactory.createContainerAsyncRequestIsCheckOnly(true));
	    request.setMetadataContainerId(
				objectFactory.createContainerAsyncRequestMetadataContainerId(
						getMetadataContainerId()));
	    
		List<SaveResult> saveResult = ToolingDriver.createObject(request);
		String requestId = saveResult.get(0).getId();
		System.out.println("INFO: New ContainerAsyncRequestId:"+requestId);
		numOfCompiles++;
		
		while (true) {
			ContainerAsyncRequest results = // , CompilerErrors
					ToolingDriver.getPort().query("SELECT Id, State, ErrorMsg FROM ContainerAsyncRequest where id = '" + requestId + "'")
	        				.getRecords().toArray(new ContainerAsyncRequest[0]) [0];    		
			
			String state = results.getState().getValue();
			System.out.println("INFO: "+state);
			
			if ("Queued".equals(state)) {
				Thread.sleep(5000);
				continue;
			} else {
				if ("Failed".equals(state)) {
					if (results.getErrorMsg()!=null) {
						System.out.println("ERROR: "+results.getErrorMsg().getValue());
						throw new Exception (results.getErrorMsg().getValue());
					}
					System.out.println("ERROR: Compile failed for unspecific reason");
					throw new Exception ("Compile failed for unspecific reason");
				}
				break;				
			}			
		}
	}

	// PART I: Class
	
	private String loadApexClass(String className) throws Exception {
		System.out.println("INFO: Load Apex Class "+className);
		ApexClass apexClass = apexClassFromName(className);
		ApexClassMember apexClassMember = new ApexClassMember();
		apexClassMember.setBody(
				objectFactory.createApexClassMemberBody(apexClass.getBody().getValue()));
		apexClassMember.setContentEntityId(
				objectFactory.createApexClassMemberContentEntityId(apexClass.getId()));
		apexClassMember.setMetadataContainerId(
				objectFactory.createApexClassMemberMetadataContainerId(
						getMetadataContainerId()));
		
		List<SaveResult> saveResult = ToolingDriver.createObject(apexClassMember);
		return saveResult.get(0).getId();
	}
	
	private ApexClass apexClassFromName(String className) throws Exception {
		System.out.println("INFO: Load Apex Class "+className);
		ApexClass[] apexClasses = // NamespacePrefix = null and
				ToolingDriver.getPort().query("select Id, Name, FullName, Body from ApexClass where Name = '"+className+"'")
			        .getRecords().toArray(new ApexClass[0]);   

		if (apexClasses.length != 1) {
			throw new Exception("ApexClass name could not be resolved: "+className);
		}
		
		return apexClasses[0];
	}
	
	private ApexClassMember apexClassMemberFromName(String className) throws Exception {
		System.out.println("INFO: Apex Class Member Id from Name "+className);
		ApexClass apexClass = apexClassFromName(className);
		
		System.out.println("INFO: Using ApexClassId "+apexClass.getId());
		ApexClassMember[] apexClassMembers =
				ToolingDriver.getPort().query("select Id, ContentEntityId, SymbolTable from ApexClassMember where ContentEntityId = '"+apexClass.getId()+"'")
			        .getRecords().toArray(new ApexClassMember[0]);
		
		for (ApexClassMember apexClassMember : apexClassMembers) {
			if (apexClassMember.getSymbolTable()!=null) {
				return apexClassMember;
			}
		}
		
		return null;
	}

	private ApexClassMember apexClassMemberFromNameCompiled(String className) throws Exception {
		ApexClassMember apexClassMember = apexClassMemberFromName(className);
		if (apexClassMember == null) {
			loadApexClass(className);
			compileMetadataContainer();
			apexClassMember = apexClassMemberFromName(className);
		}
		return apexClassMember;
	}
	

	public void analyseApexClass(String className) throws Exception {
		System.out.println("INFO: Analyse Apex Class "+className);
		arcHandler.initArcs();
		initDependencies();
		
		ApexClassMember apexClassMember = apexClassMemberFromNameCompiled(className);
		analyseApexClassMember(apexClassMember);
		
		while(!newDependencies.isEmpty()) {
			String dependantApexClassName = newDependencies.remove();
			try {
				ApexClassMember dependantApexClassMember = 
						apexClassMemberFromNameCompiled(dependantApexClassName);
				analyseApexClassMember(dependantApexClassMember);
			} catch (Exception e) {
				System.out.println("WARNING: Skipping Apex Class "+dependantApexClassName);
			}
		}
		printDependencies();
		arcHandler.printArcsAsForest(BASE_CLASS_OUTPUT_DIR+className, className);
	}

	private void analyseApexClassMember(ApexClassMember apexClassMember) {
		System.out.println("INFO: Analyse Apex Class Member "+apexClassMember);					
		SymbolTable symbolTable = apexClassMember.getSymbolTable().getValue();
		analyseApexMember(symbolTable);
	}

	// PART II: Trigger
	
	private String loadApexTrigger(String triggerName) throws Exception {
		System.out.println("INFO: Load Apex Trigger "+triggerName);
		ApexTrigger apexTrigger = apexTriggerFromName(triggerName);
		ApexTriggerMember apexTriggerMember = new ApexTriggerMember();
		apexTriggerMember.setBody(
				objectFactory.createApexTriggerMemberBody(apexTrigger.getBody().getValue()));
		apexTriggerMember.setContentEntityId(
				objectFactory.createApexTriggerMemberContentEntityId(apexTrigger.getId()));
		apexTriggerMember.setMetadataContainerId(
				objectFactory.createApexTriggerMemberMetadataContainerId(
						getMetadataContainerId()));
		
		List<SaveResult> saveResult = ToolingDriver.createObject(apexTriggerMember);
		return saveResult.get(0).getId();
	}
	
	private ApexTrigger apexTriggerFromName(String triggerName) throws Exception {
		System.out.println("INFO: Load Apex Trigger "+triggerName);
		ApexTrigger[] apexTriggeres = // NamespacePrefix = null and 
				ToolingDriver.getPort().query("select Id, Name, Body from ApexTrigger where Name = '"+triggerName+"'")
			        .getRecords().toArray(new ApexTrigger[0]);   

		if (apexTriggeres.length != 1) {
			throw new Exception("ApexTrigger name could not be resolved: "+triggerName);
		}
		
		return apexTriggeres[0];
	}
	

	private ApexTriggerMember apexTriggerMemberFromName(String triggerName) throws Exception {
		System.out.println("INFO: Apex Trigger Member Id from Name "+triggerName);
		ApexTrigger apexTrigger = apexTriggerFromName(triggerName);
		
		System.out.println("INFO: Using ApexTriggerId "+apexTrigger.getId());
		ApexTriggerMember[] apexTriggerMembers =
				ToolingDriver.getPort().query("select Id, ContentEntityId, SymbolTable from ApexTriggerMember where ContentEntityId = '"+apexTrigger.getId()+"'")
			        .getRecords().toArray(new ApexTriggerMember[0]);
		
		for (ApexTriggerMember apexTriggerMember : apexTriggerMembers) {
			if (apexTriggerMember.getSymbolTable()!=null) {
				return apexTriggerMember;
			}
		}
		
		return null;
	}

	private ApexTriggerMember apexTriggerMemberFromNameCompiled(String triggerName) throws Exception {
		ApexTriggerMember apexTriggerMember = apexTriggerMemberFromName(triggerName);
		if (apexTriggerMember == null) {
			loadApexTrigger(triggerName);
			compileMetadataContainer();
			apexTriggerMember = apexTriggerMemberFromName(triggerName);
		}
		return apexTriggerMember;
	}
	

	public void analyseApexTrigger(String triggerName) throws Exception {
		System.out.println("INFO: Analyse Apex Trigger "+triggerName);
		arcHandler.initArcs();
		initDependencies();
		
		ApexTriggerMember apexTriggerMember = apexTriggerMemberFromNameCompiled(triggerName);
		analyseApexTriggerMember(apexTriggerMember);
		
		while(!newDependencies.isEmpty()) {
			String dependantApexClassName = newDependencies.remove();
			try {
				ApexClassMember dependantApexClassMember = 
						apexClassMemberFromNameCompiled(dependantApexClassName);
				analyseApexClassMember(dependantApexClassMember);
			} catch (Exception e) {
				System.out.println("WARNING: Skipping Apex Trigger "+dependantApexClassName);
			}
		}
		printDependencies();
		arcHandler.printArcsAsForest(BASE_TRIGGER_OUTPUT_DIR+triggerName, triggerName);
	}

	private void analyseApexTriggerMember(ApexTriggerMember apexTriggerMember) {
		System.out.println("INFO: Analyse Apex Trigger Member "+apexTriggerMember);					
		SymbolTable symbolTable = apexTriggerMember.getSymbolTable().getValue();
		analyseApexMember(symbolTable);
	}
	
	// PART III: Common
	
	private void analyseApexMember(SymbolTable symbolTable) {
		System.out.println("INFO: Analyse Apex Member "+symbolTable.getName());
		List<ArcHandler.MethodPosition> items = new ArrayList<ArcHandler.MethodPosition>();
		items.add(
				new ArcHandler.MethodPosition(
						0, 
						symbolTable.getName()+"_"+symbolTable.getName(),
						true));
		
		// External References			
		for (ExternalReference externalReference : symbolTable.getExternalReferences()) {
			if (! allDependencies.contains(externalReference.getName())) {
				newDependencies.add(externalReference.getName());
				allDependencies.add(externalReference.getName());
			}
			for (ExternalMethod externalMethod : externalReference.getMethods()) {
				for (Position position : externalMethod.getReferences()) {
					items.add(
							new ArcHandler.MethodPosition(
									position.getLine(), 
									externalReference.getName()+"_"+externalMethod.getName(),
									false));
				}
			}
		}

		// Constructors
		for (Constructor constructure : symbolTable.getConstructors()) {
			items.add(
					new ArcHandler.MethodPosition(
							constructure.getLocation().getLine(), 
							symbolTable.getName()+"_"+constructure.getName(),
							true));
			for (Position position : constructure.getReferences()) {
				items.add(
						new ArcHandler.MethodPosition(
								position.getLine(), 
								symbolTable.getName()+"_"+constructure.getName(),
								false));
			}
		}
		
		// Methods
		for (Method method : symbolTable.getMethods()) {
			items.add(
					new ArcHandler.MethodPosition(
							method.getLocation().getLine(), 
							symbolTable.getName()+"_"+method.getName(),
							true));
			for (Position position : method.getReferences()) {
				items.add(
						new ArcHandler.MethodPosition(
								position.getLine(), 
								symbolTable.getName()+"_"+method.getName(),
								false));
			}
		}
		
		// Process results
		arcHandler.addArcs(items);
	}
}