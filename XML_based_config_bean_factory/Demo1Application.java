package com.department.learn;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.department.learn.io.anotation_based.Car;

@SpringBootApplication
public class Demo1Application {

	private static final Logger log = LoggerFactory.getLogger(Demo1Application.class);

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("ApplicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		Car car = (Car) factory.getBean("car");
		log.info(car.getEngineDetails());
	}

}
