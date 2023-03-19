package com.department.learn.io.anotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Rakesh Sonti 19-Mar-2023 - 12:17:27 pm
 */

public class Car {

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Car() {
		super();
	}

	private Engine engine;

	public String getEngineDetails() {
		return engine.name;
	}
}
