package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/consume")
	public String Consume() {
		
		System.out.println("request received to trigger https api");
		

		RestTemplate restTemplate = new RestTemplate();
		
		String response = restTemplate.getForObject("https://localhost:8050/hello", String.class);
		
		System.out.println("request received from https api.."+response);
		
		return "Hello World..!!!";
		
	}
}
