package com.eaiesb.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="Students")
public class Student {

	@Id
	public String id;
	
	private String firstName;
	private String lastName;
	private String city;
	private String email;
	private String phone;
	private String branch;
}
