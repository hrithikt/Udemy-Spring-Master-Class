package com.hrithikt.udemy.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.hrithikt.udemy.spring.basics.springin5steps.SpringIn5StepsCdiApplication;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	//create Mock
	@Mock
	SomeCdiDao daoMock;
	
	//Inject mock
	@InjectMocks
	SomeCdiBusiness business;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		//Call method on business
		int result = business.findGreatest();
		
		//Check if the value is correct
		assertEquals(4,result);
	}
	
	@Test
	public void testNoValueScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { });
		//Call method on business
		int result = business.findGreatest();
		
		//Check if the value is correct
		assertEquals(Integer.MIN_VALUE,result);
	}
}
