package com.sai.cbspringzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CbSpringZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(CbSpringZuulApplication.class, args);
	}
}
