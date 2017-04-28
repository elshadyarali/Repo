package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

	private static final Logger logger =LoggerFactory.getLogger(Rest.class);
	@RequestMapping("/test")
	String logTest(){
		logger.info("Testing ..");
		return "works";
	}
	
}
