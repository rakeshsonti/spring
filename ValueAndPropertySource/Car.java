package com.department.learn.io.anotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Rakesh Sonti 19-Mar-2023 - 12:17:27 pm
 */
@Component
@PropertySource("classpath:engine.properties")
public class Car {
	@Value("${my.engine-name}")
	private String engineName;
	
	@Autowired
	private EngineVehicle engine;

	public String getEngineDetails() {
		return engineName;
	}
}
