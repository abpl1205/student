package com.abpl.repository;

import org.springframework.data.repository.CrudRepository;  
import com.abpl.model.student; 

public interface StudentsRepository extends CrudRepository<student, Integer> {

	

}