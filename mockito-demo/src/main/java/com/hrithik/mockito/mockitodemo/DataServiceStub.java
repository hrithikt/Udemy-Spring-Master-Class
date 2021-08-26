package com.hrithik.mockito.mockitodemo;

public class DataServiceStub implements DataService {
	@Override
	public int[] retrieveAllData() {
		return new int[] {1, 2, 3};
	}
}
