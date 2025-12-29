package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "payment-Service")
public interface PaymentFeignClient {

	@GetMapping("/payment")
	public String callPayment();
}
