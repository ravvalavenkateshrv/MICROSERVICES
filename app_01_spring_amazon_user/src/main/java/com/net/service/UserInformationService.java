package com.net.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.UserInformation;
import com.net.repository.UserIntormationRepository;

@Service
public class UserInformationService {
	
	
	Logger logger=LoggerFactory.getLogger(UserInformationService.class);
	
	
	@Autowired
	private UserIntormationRepository  userRepository;

	public UserInformation createTheUser(UserInformation userInformation) {
	
	Optional<UserInformation> optUser=	userRepository.findById(userInformation.getId());
	
	  if(optUser.isEmpty())
	  {
		  
		  logger.info("successullly user created");
		return   userRepository.save(userInformation);
	  }else
	  {
		  logger.info("successullly did't created");
		  
		  return null;
	  }
		
	}

	public UserInformation findTheUser(String emailId) {
	
	  UserInformation optUser=userRepository.findByEmail( emailId);
	  if(optUser!=null)
	  {
		  
		  logger.info("USER FIND BY THE EMAIL");
		  return optUser;
	  }else
	  {
		  logger.info("USER FIND BY  EMAIL NOT FOUND");
		  return null;
	  }
	  
	  
		
	}

}
