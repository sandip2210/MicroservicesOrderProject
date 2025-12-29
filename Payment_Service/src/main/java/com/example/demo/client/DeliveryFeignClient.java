package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "delivery-API-Service")
public interface DeliveryFeignClient {

	@GetMapping("/delivery")
	public String getDeliveryMsg();
}
