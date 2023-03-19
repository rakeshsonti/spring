package com.department.learn.io.anotation_based;

import org.springframework.stereotype.Component;

/**
 * @author Rakesh Sonti 19-Mar-2023 - 12:17:41 pm
 */

public class Engine {

	public String name = "I am specific engine module v1.0";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
