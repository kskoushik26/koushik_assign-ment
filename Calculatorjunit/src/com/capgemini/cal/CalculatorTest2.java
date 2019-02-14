package com.capgemini.cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest2 
{

	@Test
	public void test() 
	{ 
		Calculator calc1=new Calculator();
		double res = calc1.substraction(5,5);
		assertEquals(0, res, 0);
	}


}
