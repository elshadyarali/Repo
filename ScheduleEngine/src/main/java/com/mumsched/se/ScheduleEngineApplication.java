package com.mumsched.se;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ScheduleEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleEngineApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate rest(RestTemplateBuilder builder) {
	  return builder.build();
	}
}
