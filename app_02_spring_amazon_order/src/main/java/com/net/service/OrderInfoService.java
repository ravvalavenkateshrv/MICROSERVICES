package com.net.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.OrderInfo;
import com.net.repository.OrderInformationRepository;

@Service
public class OrderInfoService {
	
	
	@Autowired
	private OrderInformationRepository orderRepository;
	
	

	public OrderInfo createTheOrder(OrderInfo order) {
		
		Optional<OrderInfo> orderInfo=orderRepository.findById(order.getId());
		
		if(orderInfo!=null)
		{
			return orderRepository.save(order);
		}
		else
		{
			return null;
		}
		
	
		
	}



	public OrderInfo getTheOrder(int id) {
		
	 Optional<OrderInfo> order=	orderRepository.findById(id);
	 if(order!=null)
	 {
		 return order.get();
	 }
	 else
	 {
		return null;
	 }
	}

}
