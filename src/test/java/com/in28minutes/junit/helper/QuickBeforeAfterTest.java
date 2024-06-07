package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	// Se ejecuta una sola vez antes de todos los Test y debe ser static
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	// Antes de cada Test
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2 executed");
	}
	
	// Despues de cada Test
	@After
	public void teardown() {
		System.out.println("After test");
	}

	// Se ejecuta una sola vez despues de todos los Test y debe ser static
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	
}
