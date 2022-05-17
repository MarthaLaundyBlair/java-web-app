package com.ab.controllers;

import java.util.List;

import com.ab.daos.StudentDAO;
import com.ab.models.Student;

public class StudentController {
	
	
	private StudentDAO studentDAO;
	
	
	public StudentController(StudentDAO studentDAO) {
		
		this.studentDAO = studentDAO;
		
	}
	
	public int registerStudent(Student s) {
		
		return this.studentDAO.register(s);
	}
			
			
	public Student loginStudent(String username,String password) {
		
		return this.studentDAO.login(username, password);
	}
	
	
	public List<Student> getAllStudents(){
		
		return this.studentDAO.loadRegisteredStudents();
	}
	
	public String getAllStudentsString(){
		
		return this.studentDAO.loadRegisteredStudentsString();
	}
	
}
