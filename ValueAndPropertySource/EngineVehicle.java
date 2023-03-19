package com.department.learn.io.anotation_based;

import org.springframework.stereotype.Component;

/**
 * @author Rakesh Sonti 19-Mar-2023 - 12:17:41 pm
 */
@Component
public class EngineVehicle {

	private String name = "I am specific engine module v1.0";
	private String version;
	private Integer price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
