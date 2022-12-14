package com.eaiesb.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	public StudentService service;
	
	@PostMapping("/student")
	public Student createStudent(@Validated @RequestBody Student stud) {
		return service.create(stud);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return service.getAll();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getStudentById(@PathVariable String id) {
		return service.getById(id);
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@PathVariable String id, @Validated @RequestBody Student stud) {
		return service.update(id, stud);
	}
	
	@DeleteMapping("/student/{id}") 
	public void deleteStudent(@PathVariable String id) {
		service.delete(id);
	}
}
