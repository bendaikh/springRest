package com.springRest.Springrest.services;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRest.Springrest.dao.StudentDao;
import com.springRest.Springrest.entities.Students;

@Service
public class StudentServicesImpl implements StudentSevice {
	
	@Autowired
	private StudentDao studentsDao; 
	
	public StudentServicesImpl() {
		
	}
	
	
	
	@Override
	public List<Students> getStudents() {
		
		 return studentsDao.findAll();
	}

	
	
	
	@Override
	public Optional<Students> getStudent(long studentGrNo) {
		
		return studentsDao.findById(studentGrNo);
	}

	
	
	
	@Override
	public Students addStudent(Students student) {
		studentsDao.save(student);

		return student;
	}



	@Override
	public Students updateStudent(Students student) {
		
		return student;
	}



}