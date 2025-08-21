package com.net;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PaymentController {
	
	@GetMapping("/options")
	public List<String> paymentOptions()
	{
		return List.of("1 upi id","net bankeing","phone pe");
	}

	@GetMapping("/netbanking")
	public String thisIsNetBanking()
	{
		return "this is from net banking";
	}

}
