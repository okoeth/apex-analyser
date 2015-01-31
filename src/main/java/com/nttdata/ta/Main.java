/**
 * 
 * java com.nttdata.ta.Main oliver.koeth@nttdata.com.daimler.tcc China!2015
 *
 */
package com.nttdata.ta;

//import com.nttdata.sf.partner.DescribeRelatedContentItem;
//import com.nttdata.sf.tooling.DescribeSObjectResult;
//import com.nttdata.sf.tooling.Field;

public class Main {
	static ApexClassAnalyser apexClassAnalyser = new ApexClassAnalyser ();
	
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");

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

//			apexClassAnalyser.analyseApexTrigger("RecallAfterInsertUpdate");
//			apexClassAnalyser.analyseApexTrigger("RecallBeforeDelete");
//    		apexClassAnalyser.analyseApexTrigger("AccountLinkAfter");
//			apexClassAnalyser.analyseApexTrigger("AccountAfterInsertOrUpdate");
//			apexClassAnalyser.analyseApexTrigger("AccountBeforeInsertUpdate");
//    		apexClassAnalyser.analyseApexTrigger("TriggerAccount");
//    		apexClassAnalyser.analyseApexClass("AccountHelper");
        }
        finally {
        	PartnerDriver.getWSBindingProvider().close();
        	ToolingDriver.getWSBindingProvider().close();
        }
        
        
	}
	
	public static void analyseCRiSTrigger() throws Exception {
		// Account
		apexClassAnalyser.analyseApexTrigger("AccountAfterInsertOrUpdate");
		apexClassAnalyser.analyseApexTrigger("AccountBeforeInsertUpdate");
		// Account Link
		apexClassAnalyser.analyseApexTrigger("ShareAccountLinksToDealer");
		apexClassAnalyser.analyseApexTrigger("AccountLinkAfter");
		// Retail Task
		apexClassAnalyser.analyseApexTrigger("RetailTaskAfter");
		//Contact
		apexClassAnalyser.analyseApexTrigger("ContactAfterInsertUpdate");
		apexClassAnalyser.analyseApexTrigger("ContactBeforeInsertUpdate");
		// Vehicle Rel (no triggers for vehicle!)
		apexClassAnalyser.analyseApexTrigger("TriggerVehicleRelationship");
		apexClassAnalyser.analyseApexTrigger("VehicleRelationshipAfter");
	}
}
