package com.capgemini.cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest3 {

	@Test
	public void test() 
	{
		Calculator calc2=new Calculator();
		double res = calc2.multiplication(5,5);
		assertEquals(25,res, 0);
	
	}

}
