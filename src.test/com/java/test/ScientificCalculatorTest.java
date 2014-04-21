package com.java.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.ScientificCalculator;

public class ScientificCalculatorTest {
	
	@Test
	public void testFactorial() {
		ScientificCalculator calc = new ScientificCalculator();

		int result = calc.factorial(5);

		assertEquals(120, result);
	}
	
	@Test
	public void testTimes() {
		ScientificCalculator calc = new ScientificCalculator();
		
		int result = calc.times(4, 2, 9);
		
		assertEquals(72, result);
	}
}
