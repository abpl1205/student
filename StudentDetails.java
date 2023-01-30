package com.abpl.details;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service; 

import com.abpl.model.student;  
import com.abpl.repository.StudentsRepository; 

//defining the business logic  
@Service  

public class StudentDetails {
	
	
	@Autowired  
	StudentsRepository studentsRepository;  
	//getting all students record by using the method findaAll() of CrudRepository  
	public List<student> getAllStudents()   
	{  
		List<student> student = new ArrayList<student>();  
		studentsRepository.findAll().forEach(students1 -> student.add(students1));  
		return student;  
	}  
	
	//getting a specific record by using the method findById() of CrudRepository  
	public student getStudentByRollNo(int RollNo)   
	{  
		return studentsRepository.findById(RollNo).get();  
	} 
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(student students)   
	{  
		studentsRepository.save(students);  
	}
	
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int RollNo)   
	{  
		studentsRepository.deleteById(RollNo);  
	}  
	
	//updating a record  
	public void update(student student, int SRollNo)   
	{  
		studentsRepository.save(student);  
	}

	public student getStudentsByRollNo(int srollno) {
		// TODO Auto-generated method stub
		return null;
	}  
}
