package com.department.learn.io.anotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Rakesh Sonti 19-Mar-2023 - 12:17:27 pm
 */
@Component
public class Car {
	@Autowired
	Engine eng;
	public String getEngineDetails() {
		return eng.name;
	}
}
