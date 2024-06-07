package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	// El test pasará si no hay ningún fail
	@Test
	public void test() {
		StringHelper helper = new StringHelper();
		// expected, actual
		// AACD => CDD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
