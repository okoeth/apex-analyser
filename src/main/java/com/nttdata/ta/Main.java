/**
 * 
 * java com.nttdata.ta.Main oliver.koeth@nttdata.com.daimler.tcc China!2015
 *
 */
package com.nttdata.ta;

public class Main {
	static ApexClassAnalyser apexClassAnalyser = new ApexClassAnalyser ();
	
	public static void main(String[] args) throws Exception {
        try {        	
    		if (args.length < 3) {
    			System.out.println("Usage: apex-analyser <user> <password> -[dtc] <name>");
    			System.exit(0);
    		}
        	String sessionId = 
        		PartnerDriver.loginForSessionId(args[0], args[1]); 
    		System.out.println(sessionId);

    		ToolingDriver.createWSBindingProvider(sessionId);
    		
    		ApexClassAnalyser apexClassAnalyser = new ApexClassAnalyser();

    		if (args[2].equals("-d")) {
    			apexClassAnalyser.deleteMetadataContainer();
    		} else if (args[2].equals("-t")) {
    			apexClassAnalyser.analyseApexTrigger(args[3]);
    		} else if (args[2].equals("-c")) {
    			apexClassAnalyser.analyseApexClass(args[3]);
    		}

        }
        finally {
        	PartnerDriver.getWSBindingProvider().close();
        	ToolingDriver.getWSBindingProvider().close();
        }        
	}
}
