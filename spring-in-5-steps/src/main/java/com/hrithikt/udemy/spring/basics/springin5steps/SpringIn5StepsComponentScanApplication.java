package com.hrithikt.udemy.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hrithikt.udemy.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.hrithikt.udemy.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	public static void main(String[] args) {
		  
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
		
		ComponentDAO personDao = applicationContext.getBean(ComponentDAO.class);
		
	}

}
