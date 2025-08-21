package com.net.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.StudentInformation;
import com.net.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/types")
	public String typesOfPayments()
	{
		return "PAYMENT SUCCESSFULLY DONE";
	}

	
	@PostMapping("/create/user")
	public StudentInformation createTheUser(@RequestBody StudentInformation student)
	{
		return studentService.createUser(student);
	}
	
	@GetMapping("all/users")
	public List<String> getAllusers()
	{
		return List.of("1 First user","2 user");
	}
	
	@GetMapping("find/user/{id}")
	public String findTheStudent(@PathVariable int id)
	{
		return "STUDENT FIND AT :"+id;
	}
}
