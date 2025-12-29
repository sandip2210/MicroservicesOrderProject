package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.DeliveryFeignClient;

@RestController
public class PaymentController {

	@Autowired
	DeliveryFeignClient deliveryFeignClient;

	@GetMapping("/payment")
	public String getPaymentMsg() {
		System.out.println("Inside Payment Microsevice");
		System.out.println("Call To Dilevary Miceroservice");
		String delivaryMsg = deliveryFeignClient.getDeliveryMsg();

		String paymentMsg = "Payment Microservice 2";

		return paymentMsg + "====" + delivaryMsg;
	}
}
