package com.hrithik.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hrithikt.junit.MyMath;

class MyMathTest {
	
	MyMath myMath = new MyMath();

	@Test
	public void sum_with3numbers() {
		int result = myMath.sum(new int[] {1, 2, 3});
		//System.out.println(result);
		assertEquals(6, result);
	}

}
