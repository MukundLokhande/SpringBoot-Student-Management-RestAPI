package com.MukundLearning.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MukundLearning.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

} 
