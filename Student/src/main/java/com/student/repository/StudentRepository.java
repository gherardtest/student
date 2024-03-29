package com.student.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	public List<Student> findByfullName(String fullName);
	public List<Student> findBydni(int dni);
}