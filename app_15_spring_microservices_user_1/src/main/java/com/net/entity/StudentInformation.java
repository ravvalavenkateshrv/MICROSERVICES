package com.net.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="micro_student_information_second")
public class StudentInformation {
	
	
	@Id
	private int id;
	private String firstName;
	private String  lastName;

}
