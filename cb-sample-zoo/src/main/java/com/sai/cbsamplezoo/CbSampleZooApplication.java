package com.sai.cbsamplezoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class CbSampleZooApplication {

	@GetMapping("/")
	String getZoo() {
		return "This is Zoo.";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(CbSampleZooApplication.class, args);
	}
}
