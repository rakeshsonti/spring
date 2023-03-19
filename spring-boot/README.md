> What is spring boot? why should we use it?
1. its a spring module
2. its used for RAD(rapid application development)
3. extra support auto configuration,embedded application server like tomcat , jetty
4. help to create efficient,fast,stand alone application
5. remove a lot of boiler plate code

>  What is RAD? How can we achive RAD?
RAD is modifed waterfall model which focus on devloping software in sort span of time
* Business Modeling: Raw requirement are discussed in this phase
* Data Modeling: relationship stablished between data object and buisness requirement 
* Process Modeling: Process description are given related to adding , deleting, retriving and modifying data object
* Application Generation: Convert process model to actual application build inthis phase. time consuming phase || Springboot help to reduce development time and develop application in very short span of time
* Testing and Turnover:

> Change port in springboot?

application.properties >  server.port=8081

>  groupId vs  artifactId

groupId – a unique base name of the company or group that created the project

artifactId – a unique name of the project

> modelVersion - 

model version is the version of project descriptor your POM conforms to. It needs to be included and is set. The value 4.0.0 just indicated that it is compatible Maven 3.

> change embedded server in spring-boot

exclude tomcat dependency from starter web dependency and include jetty dependncy or start the application it will run on jetty server


