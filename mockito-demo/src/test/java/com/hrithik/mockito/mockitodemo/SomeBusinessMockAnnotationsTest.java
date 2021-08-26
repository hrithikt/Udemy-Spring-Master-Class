package com.hrithik.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationsTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void testFindGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(3,result);
	}
	
	@Test
	public void testFindGreatestFromAllData_ForOneData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3});
		
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(3,result);
	}

}


