package com.hrithik.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListTest {

	@Test
	void testSize() {
		List listMock = mock(List.class);
		
		when(listMock.size()).thenReturn(10).thenReturn(20);
		
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}

}
