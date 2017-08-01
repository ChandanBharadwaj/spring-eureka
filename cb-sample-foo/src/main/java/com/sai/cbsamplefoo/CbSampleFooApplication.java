package com.sai.cbsamplefoo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@RequestMapping("/rest")
public class CbSampleFooApplication {

	@GetMapping
	ResponseEntity<Map> getFoo(@RequestHeader Map<String,Object> headers) {
		System.out.println(headers);
		return (ResponseEntity<Map>) headers;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(CbSampleFooApplication.class, args);
	}
}
