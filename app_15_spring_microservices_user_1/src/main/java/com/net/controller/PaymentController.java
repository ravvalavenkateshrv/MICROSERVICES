package com.net.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	
	@GetMapping("/payment/types")
	public List<String> typesOfPayments()
	{
		return List.of("1 Phone Pe","Google Pe");
	}

}
