package com.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.net.entity.OrderInfo;
import com.net.service.OrderInfoService;

@RestController
public class OrderController {
	
	
	@Autowired
	private OrderInfoService orderService;
	
	
	@PostMapping("/create")
	public OrderInfo createOrder(@RequestBody OrderInfo orderInfo)
	{
		
		return orderService.createTheOrder(orderInfo);
	}
	@PostMapping("/info/{id}")
	public OrderInfo getOrder(@PathVariable int id)
	{
		
		return orderService.getTheOrder(id);
	}

}
