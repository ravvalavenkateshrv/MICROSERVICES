package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.net.entity.StudentInformation;

public interface StudentRepository extends JpaRepository<StudentInformation, Integer> {

}
