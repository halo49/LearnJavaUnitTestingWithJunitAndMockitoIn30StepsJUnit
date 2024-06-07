package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
// Para usar parametros en los test
// 1.- Se agrega esta anotacion con esta clase @RunWith(Parameterized.class)
@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	// AACD => CDD, ACD => CD, CDEF => CDEF, CDAA => CDAA
	
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	// 3.- El constructor se encarga de obtener los parametros del metodo que tiene @Parameters
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// 2.- Se definen los parametros con @Parameters en un metodo 
	// y se implementa como sigue 
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {
				{"AACD", "CD"},
				{"ACD", "CD"}
		};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
}
