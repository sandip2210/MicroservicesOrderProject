package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-API-Service")
public interface WelcomeFeignClient {

	@GetMapping("/welcome")
	public String getWecomeMsg();
}
