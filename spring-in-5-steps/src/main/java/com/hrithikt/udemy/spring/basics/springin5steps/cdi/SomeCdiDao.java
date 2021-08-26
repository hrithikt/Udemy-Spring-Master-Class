package com.hrithikt.udemy.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named //instead of @Component
public class SomeCdiDao {
	public int[] getData() {
		return new int[] {5,8,15};
	}
}
