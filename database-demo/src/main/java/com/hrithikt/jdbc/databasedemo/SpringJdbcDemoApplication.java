package com.hrithikt.jdbc.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.hrithikt.jdbc.databasedemo.entity.Person;
import com.hrithikt.jdbc.databasedemo.jdbc.PersonJdbcDao;



//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		
		logger.info("User id 10001 -> {}", dao.findById(10001));
		
		logger.info("Deleting id 10002 -> No of Rows Deleted - {}", dao.deleteById(10002));
		
		logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Thara", "Chennai", new Date())));
		
		logger.info("Updating 10003 -> {}", dao.update(new Person(10003, "Peter", "Mumbai", new Date())));
	}

}
