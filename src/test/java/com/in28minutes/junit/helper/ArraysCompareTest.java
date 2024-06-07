package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = {12, 3, 4, 1};
		int[] expected = {1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}
	
	// Este test se puede utilizar para ver si un Test tarda mas de lo que se determine en timeout
	// En 1 milisegundo truena y en 10 pasa
	@Test(timeout=10)
	public void testSort_Performance() {
		int array[] = {12, 23, 4};
		for(int i=1; i<=1000000;i++) {
			array[0] = i;
			Arrays.sort(array);
		}
		
	}
}
