package com.java;

public class ScientificCalculator {

	public int factorial(int number) {
		int result = number;

		for (int i = number; i > 1; i--) {
			result = result * (i-1);
		}
		return result;
	}

	public int times(int numberFirst, int numberSecond, int numberThird) {
		Calculator calc1 = new Calculator(numberFirst, numberSecond);
		int result = calc1.times();

		Calculator calc2 = new Calculator(result, numberThird);
		return calc2.times();
	}

}
