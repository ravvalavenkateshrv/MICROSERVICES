package com.net.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/create/user")
	public String createUser()
	{
		return "SUCCESSFULLY CREATED";
	}

}
