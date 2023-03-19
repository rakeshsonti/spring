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

> Can we disable default web server?

spring provide flexibility to build your application loosely coupled.

application.yml

spring: 
  main:
    web-application-type:  none

> How to disable autoConfiguration class?

In main class where @SpringBootApplication available . @SpringBootApplication contains @EnableAutoConfiguration so exclude here

@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})


> what @SpringBootApplication annotation internally do ?

@SpringBootApplication annotation is equivalents to @ComponentScan, @EnableAutoConfiguration and @Configuration

@Configuration- help to find beans in your perticular dependency injection

@EnableAutoConfiguration - help to auto scan. find set of dependency and add it to our application classpath

@ComponentScan- place where you can scan for your beans and components

we can use indivisually as spring is loosely coupled and use one annotation intead of three

> How to use property in java file defined in application.properties.

@PropertySource("classpath:enginedetails.properties")

@Value("${my.engine-name}")
	private String engineName;
  
  Driver Code

ConfigurableApplicationContext context=	SpringApplication.run(Demo1Application.class, args);
		String engineName=context.getBean(Car.class).getEngineDetails();
		log.info(engineName);

````

enginedetails.properties

my.engine-name=hypo`

````

xml base configuration

[Folder URL](https://github.com/rakeshsonti/spring/tree/master/ValueAndPropertySource)

Driver Code

````
ConfigurableApplicationContext context=	SpringApplication.run(Demo1Application.class, args);
//		String engineName=context.getBean(Car.class).getEngineDetails();
//		log.info(engineName);
		
		EngineVehicle engObj= context.getBean(EngineVehicle.class);
		log.info(engObj.getName());
````

pojo Class


````
@Component
public class EngineVehicle {

	private String name = "I am specific engine module v1.0";
	private String version;
	private Integer price;
  }

````

engine.xml

````
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:context="http://www.springframework.org/schema/context"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans.xsd
http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context.xsd">

	
	<!-- place configuration details here -->
	<bean id="car" class="com.department.learn.io.anotation_based.Car">
		<!-- constructor  injection -->
		<constructor-arg ref="engine"></constructor-arg>
	</bean>
	
	<context:property-placeholder location="classpath:engine.properties"/>
	<bean id="engine"
		class="com.department.learn.io.anotation_based.EngineVehicle">
		<property name="name" value="{engine.name}"></property>
		<property name="version" value="{engine.version}"></property>
		<property name="price" value="{engine.price}"></property>
		</bean>
</beans>
````


