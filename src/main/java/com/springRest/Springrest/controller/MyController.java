package com.springRest.Springrest.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springRest.Springrest.entities.Students;
import com.springRest.Springrest.services.StudentSevice;


@RequestMapping("")
@CrossOrigin(origins = "*")
@RestController
public class MyController {
	
	@Autowired
	private StudentSevice studentService;
	
	@GetMapping( "/home" )
	
	public String home() {
		return "This is Home Page";
	}
	
	// Get students info
	@GetMapping( "/students" )
	public List<Students> getStudents(){
		
		return this.studentService.getStudents();
		
	}
	
	@GetMapping("students/{studentGrNo}")
	public Optional<Students> getStudent(@PathVariable String studentGrNo ) {
		
		return this.studentService.getStudent(Long.parseLong(studentGrNo));
		
	}
	
	@PostMapping( "/students" )
	public Students addStudent(@RequestBody Students student) {
		System.out.println("+++++++++++");
		System.out.println(student);
		return this.studentService.addStudent(student);
		
	}	
	
	
	@PutMapping( "/students" )
	public Students updateStudent(@RequestBody Students student) {
		
		return this.studentService.updateStudent(student);
	}	

	
	
	
}
 