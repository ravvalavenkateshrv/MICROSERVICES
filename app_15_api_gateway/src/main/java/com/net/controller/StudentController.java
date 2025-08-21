package com.net.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/create")
	public String createUser()
	{
		return "CREATE SUCCESSFULLY";
	}

}
