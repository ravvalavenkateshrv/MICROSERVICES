package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_entity_from_config_server")
public class UserEntity {
	
	
	@Id
	private int id;
	private String name;
	private int age;

}
