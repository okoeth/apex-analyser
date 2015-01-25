## Introduction ##
This apex analyser generates dependency diagrams as PDFs. 
The dependencies are analysed using the Tooling API. Further
explanations are given in this [blog post](http://mfdcbwy.postach.io/well-it-depends-using-the-tooling-api-to-generate-dependency-graphs-for-apex-classes-and-triggers)

## Configuration ##
There are a number of hard coded parameters that need to be adjusted 
to your environment:
*  The login URL is <https://login.salesforce.com> So if you need to use this
in a sandbox either manipulate the wsdl files or download the wsdl
filees from your sandbox and re-generate the java code as shown in the
abovementioned blogpost (this generation is not yet part of the maven
file).
*  The path to the GraphViz "dot" command in ArcHandler.java
*  The path to the output directories in ApexClassAnalyser.java
*  The trigger / class name(s) to be analysed in Main.java

## Usage ###
Run `mvn install` to build the jar file with dependencies. Then run
`java -cp target/apex-analyser-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.nttdata.ta.Main <username> <password>`
