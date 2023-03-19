package com.department.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.department.learn.io.anotation_based.Car;

@SpringBootApplication
public class Demo1Application {

	private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);

	public static void main(String[] args) {
//		ConfigurableApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car car = (Car) context.getBean("Car");
		log.info(car.getEngineDetails());
	}

}
