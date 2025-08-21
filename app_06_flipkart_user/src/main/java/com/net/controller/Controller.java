package com.net.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/create/user")
	public String creteUser()
	{
		return "SUCCESSFULLY CREATED";
	}

}
