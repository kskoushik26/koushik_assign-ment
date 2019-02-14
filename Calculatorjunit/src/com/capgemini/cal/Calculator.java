package com.capgemini.cal;

public class Calculator 
{
	public double num1;
	public double num2;
	public double result;
	
	public double addition(double num1, double num2){
		result=num1+num2;
		System.out.println("Answer is  "+result);
		return result;
	}
	public double substraction(double num1, double num2){
		result=num1-num2;
		System.out.println("Answer is "+result);
		return result;
	}
	public double multiplication(double num1, double num2){
		result=num1*num2;
		System.out.println("Answer is "+result);
		return result;
	}
	public double division(double num1, double num2){
		result=num1/num2;
		System.out.println("Answer is "+result);
		return result;
	}
}
