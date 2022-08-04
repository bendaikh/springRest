package com.springRest.Springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springRest.Springrest.entities.Students;

public interface StudentDao extends JpaRepository<Students, Long> {
	
		

}
