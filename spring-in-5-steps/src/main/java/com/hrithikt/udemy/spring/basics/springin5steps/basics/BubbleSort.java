package com.hrithikt.udemy.spring.basics.springin5steps.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {
	public int[] sort(int[] array) {
		//Logic for sorting
		return array;
	}

}
