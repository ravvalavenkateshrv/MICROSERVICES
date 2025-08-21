package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.UserInformation;
import com.net.service.UserInformationService;

@RestController
public class UserController {
	
	@Autowired
	private UserInformationService userService;
	
	
	@PostMapping("/create")
	public UserInformation createUser(@RequestBody UserInformation userInformation)
	{
		
		return userService.createTheUser(userInformation);
		
	}
	
	@GetMapping("/create/{emailId}")
	public UserInformation findUser(@PathVariable String emailId)
	{
		
		return userService.findTheUser(emailId);
		
	}
	
	
	
	
	

}
