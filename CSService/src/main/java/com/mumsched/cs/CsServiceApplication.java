package com.mumsched.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class CsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsServiceApplication.class, args);
	}
}
