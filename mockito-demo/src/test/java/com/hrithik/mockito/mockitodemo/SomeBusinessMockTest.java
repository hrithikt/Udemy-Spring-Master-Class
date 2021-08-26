package com.hrithik.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {
	
	@Test
	public void testFindGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.retrieveAllData() => new int[] {1,2,3};
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(3,result);
	}
	
	@Test
	public void testFindGreatestFromAllData_ForOneData() {
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.retrieveAllData() => new int[] {1,2,3};
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(3,result);
	}

}


