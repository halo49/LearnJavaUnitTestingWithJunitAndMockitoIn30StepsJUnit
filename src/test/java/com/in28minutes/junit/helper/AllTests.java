package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QuickBeforeAfterTest.class, StringHelperTest.class })
public class AllTests {
	// Asi es como se configura una Suite de Tests
	// Se pueden crear manual mente con el wizard create new junit suite 
	// y seleccionar clases de Tests seran parte de la Suite
}
