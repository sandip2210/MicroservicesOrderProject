package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.PaymentFeignClient;

@RestController
public class OrderController {

	@Autowired
	PaymentFeignClient paymentFeignClient;
	
	@Autowired
	Environment environment;

	@GetMapping("/order")
	public String getMessage() {
		System.out.println("Inside Order Microservice Run on Port="+environment.getProperty("local.server.port"));
		
		String paymetCall = paymentFeignClient.callPayment();
		return "Order Microservices 1 ====" + paymetCall;
	}

}
