#About the project

This is a small assignment which covers two rest APIs
1.  http://localhost:8080/track/getHistory
2.  http://localhost:8080/track/trackValue

## Initial SetUp Steps

Download the code import the project in Eclipse or IntelliJ IDE and run the _AssignmentApplication.java_ file

### Setup JAVA 17
* [JDK download link](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

#### POST API SAMPLES: 
    API URL: /track/trackValue

		Request                         Response
            {"input": "steve"}             {output: null}
            {"input": "joe"}               {output: steve}
            {"input": "mary"}              {output: joe}

###### GET API SAMPLE:
    API URL: /track/getHistory
           
            Response ["marry","joe","steve"]

