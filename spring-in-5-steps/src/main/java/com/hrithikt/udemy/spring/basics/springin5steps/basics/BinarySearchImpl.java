package com.hrithikt.udemy.spring.basics.springin5steps.basics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] array, int numberToSearchFor) {
		int[] sortedArray = sortAlgorithm.sort(array);
		System.out.println(sortAlgorithm);
		//Search the array
		return 3;
	}
	 
}
