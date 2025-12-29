package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;

@RestController
public class DeliveryController {

	@Autowired
	Environment environment;
	
	@GetMapping("/delivery")
	public String getDeliveryMessage() {
		System.out.println("Inside Delivery Service Running Port="+environment.getProperty("local.server.port"));
		String second = "Delivery Microservices 3";

		return second;
	}

}
