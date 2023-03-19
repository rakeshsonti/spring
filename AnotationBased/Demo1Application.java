package com.department.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.department.learn.io.anotation_based.Car;

@SpringBootApplication
public class Demo1Application {

private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		Car car=context.getBean(Car.class);
		log.info(car.getEngineDetails());
				
	}

}
