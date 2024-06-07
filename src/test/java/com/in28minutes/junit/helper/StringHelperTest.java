package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	
	// El test pasará si no hay ningún fail
	// No es bueno tener mas de una condicion en el test
	// Cada metodo de test debe regresar void y debe ser publico
	// El nombre del metodo del test comenzara con test y el nombre
	// del metodo que se quiera probar y luego _ y la condicion que se esta probando
	@Test
	public void testTruncateAInFirst2Positions_Aintfirst2Positions() {
		// expected, actual
		// AACD => CDD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		// expected, actual
		// AACD => CDD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoA() {
		// expected, actual
		// AACD => CDD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_NoChange() {
		// expected, actual
		// AACD => CDD, ACD => CD, CDEF => CDEF, CDAA => CDAA
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		// actual
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		// actual
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
}