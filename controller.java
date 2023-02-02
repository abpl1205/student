package com.abpl.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.abpl.model.student;  
import com.abpl.details.StudentDetails;  


@RestController


public class controller {

	
	@Autowired
	
	StudentDetails studentdetails;  
	
	@GetMapping("/student")  
	private List<student> getAllStudents()  
	{  
		return studentdetails.getAllStudents();  
	}
	
	@GetMapping("/student/{studentsrollno}")  
	private student getStudents(@PathVariable("studentsrollno") int srollno)   
	{  
		return studentdetails.getStudentsByRollNo(srollno);  
	}  
	
	
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/student/{studentsrollno}")  
	private void deleteStudent(@PathVariable("srollno") int srollno)   
	{  
		studentdetails.delete(srollno);  
	} 
	
	//creating post mapping that post the student detail in the database  
	@PostMapping("/student")  
	private int saveStudent(@RequestBody student student)   
	{  
		studentdetails.saveOrUpdate(student);  
		return student.getStudentSRollNo();  
	}
	
	//creating put mapping that updates the student detail   
	@PutMapping("/student")  
	private student update(@RequestBody student student)   
	{  
		studentdetails.saveOrUpdate(student);  
		return student;  
	}  
}
