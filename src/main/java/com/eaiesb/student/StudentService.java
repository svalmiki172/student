package com.eaiesb.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	public StudentRepository repo;
	
	public Student create(Student stud) {
		return repo.save(stud);
	}
	
	public List<Student> getAll() {
		return repo.findAll();
	}
	
	public Optional<Student> getById(String id) {
		return repo.findById(id);
	}
	
	public Student update(String id, Student stud) {
		stud.setId(id);
		return repo.save(stud);
	}
	
	public void delete(String id) {
		repo.deleteById(id);
	}
}
