package com.hrithik.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {
	SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
	
	@Test
	void testFindGreatestFromAllData() {
		int result = businessImpl.findGreatestFromAllData();
		assertEquals(3,result);
	}

}


class DataServiceStub implements DataService {
	@Override
	public int[] retrieveAllData() {
		return new int[] {1, 2, 3};
	}
}