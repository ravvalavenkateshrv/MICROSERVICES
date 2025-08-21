package com.net.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
	
	
	@GetMapping("/create/user")
	public String createuser()
	{
		return "USER CREATED SUCCESSFULLY";
	}

}
