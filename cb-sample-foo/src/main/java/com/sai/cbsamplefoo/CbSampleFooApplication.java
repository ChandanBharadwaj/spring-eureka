package com.sai.cbsamplefoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class CbSampleFooApplication {

	@GetMapping("/")
	String getFoo() {
		return "This is Foo.";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(CbSampleFooApplication.class, args);
	}
}
