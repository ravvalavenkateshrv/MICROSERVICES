package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MicroserviceEntity {
	
	
	@Id
	private int id;
	private String name;

}
