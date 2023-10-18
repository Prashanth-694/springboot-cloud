package com.eidiko.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@RequestMapping("/orderServiceFallback")
	public String orderServiceFallback() {
		return "Order Service is down.";
	}
	
	@RequestMapping("/paymentServiceFallback")
	public String paymentServiceFallback() {
		return "Payment Service is down.";
	}
}
