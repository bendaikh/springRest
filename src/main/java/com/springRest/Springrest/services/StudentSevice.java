package com.springRest.Springrest.services;

import java.util.List;
import java.util.Optional;

import com.springRest.Springrest.entities.Students;

public interface StudentSevice {
	
	public List<Students> getStudents();
	
	public Optional<Students> getStudent(long studentGrNo);
	
	public Students addStudent(Students student);
	
	public Students updateStudent(Students student);
	
	
}
