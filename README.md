# Test existing tools to generate call graph for Java application

## java-callgraph
Github: https://github.com/gousiosg/java-callgraph  
Test steps:
- git clone 
- mvn package -Dmaven.test.skip=true # Note that it is os-incompatible, cannot run this command under Windows
- java -jar javacg-0.1-SNAPSHOT-static.jar [PATH_TO_YOUR_LIB1] [PATH_TO_YOUR_LIB2] ...


## Doxygen
Test steps:
- apt-get install Doxygen GraphViz
- doxygen -g sample_text.conf
- edit sample_text.conf
- doxygen sample_text.conf