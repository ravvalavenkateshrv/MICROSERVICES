package com.net.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.entity.StudentInformation;
import com.net.repository.StudentRepository;

@Service
public class StudentService {
	
	Logger logger=LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	private StudentRepository studentRepository;

	 public StudentInformation createUser(StudentInformation student) {
	        logger.info("Attempting to create or update student with ID: {}", student.getId());

	      

	        StudentInformation savedStudent = studentRepository.save(student);

	        logger.info("Student saved with ID: {}", savedStudent.getId());
	        return savedStudent;
	    }
}
