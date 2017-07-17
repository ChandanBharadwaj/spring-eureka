package com.sai.cbspringeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CbSpringEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbSpringEurekaApplication.class, args);
	}
}
