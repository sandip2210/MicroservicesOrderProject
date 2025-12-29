package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.WelcomeFeignClient;

@RestController
public class GreetRestController {

	@Autowired
	WelcomeFeignClient welcomeFeignClient;
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		System.out.println("Call Greet Microsevice");
		
		String welcomeMsg=welcomeFeignClient.getWecomeMsg();
		
		String msg="Second Microservice Greet";
		
		return msg +" = "+ welcomeMsg;
	}
}
