package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.entity.UserInformation;

public interface UserIntormationRepository extends JpaRepository<UserInformation, Integer> {
	
	public UserInformation findByEmail(String emailId);

}
