package com.java;

public class Calculator {
	
	private int firstNum;
	private int secondNum;
	
	public Calculator(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public int sum() {
		return this.firstNum + this.secondNum;
	}

	public int subtraction() {
		return this.firstNum - this.secondNum;
	}

	public double division() {
		return (double) (this.firstNum) / (double) this.secondNum;
	}

	public int times() {
		return this.firstNum * this.secondNum;
	}	
}