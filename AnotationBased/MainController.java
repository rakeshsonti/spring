package com.department.learn.io.anotation_based;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rakesh Sonti 19-Mar-2023 - 12:19:48 pm
 */
@RestController
public class MainController {
	
	private static final Logger log = LoggerFactory.getLogger(MainController.class);

	@GetMapping("/hello")
	public String getHello() {
		log.info("Hello Controller called");
		return "Hello";
	}
	@GetMapping("/exe")
	public void getExe() {
		log.info("Exe service called");
		
	}
}
