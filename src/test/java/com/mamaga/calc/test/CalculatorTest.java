package com.mamaga.calc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mamaga.calc.Calculator;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator voCalc = new Calculator(5,8);

		int result = voCalc.sum();

		assertEquals(13, result);
	}
	
	
	@Test
	public void testSubtraction() {
		Calculator voCalc = new Calculator(5, 3);
		int result = voCalc.subtraction();
		
		assertEquals(2, result);
	}
	
	@Test
	public void testTimes() {
		Calculator voCalc = new Calculator(2, 9);
		
		int result = voCalc.times();
		
		assertEquals(18, result);
	}
	
	@Test
	public void testDivision() {
		Calculator voCalc = new Calculator(7, 2);
		double result = voCalc.division();
		
		assertEquals(3.5, result, 0);
	}

}
