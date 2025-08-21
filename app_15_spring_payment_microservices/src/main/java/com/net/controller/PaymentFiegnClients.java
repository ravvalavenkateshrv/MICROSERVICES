package com.net.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.net.entity.StudentInformation;

import io.netty.handler.codec.http.HttpMethod;

@FeignClient(name = "amazonuser")
public interface PaymentFiegnClients {
	
	@RequestMapping(method=RequestMethod.GET,path="/payment/types")
	List<String> getPaymentOptions();
	
	
}
