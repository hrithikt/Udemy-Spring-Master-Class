package com.hrithikt.jdbc.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrithikt.jdbc.databasedemo.entity.Person;

public interface PersonSpringDataRepository 
					extends JpaRepository<Person, Integer>{
	
}
