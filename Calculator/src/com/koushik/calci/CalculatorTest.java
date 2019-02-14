package com.koushik.calci;

public class CalculatorTest 
{
	double num1,num2;
	double answer;
	char c;
	public CalculatorTest(double num1, double num2,  char c, double answer) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.answer = answer;
		this.c = c;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getAnswer() {
		return answer;
	}
	public void setAnswer(double result) {
		this.answer = answer;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}

}
