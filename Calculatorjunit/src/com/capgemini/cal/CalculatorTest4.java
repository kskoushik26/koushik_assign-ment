package com.capgemini.cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest4 {

	@Test
	public void test() {
		Calculator calc4=new Calculator();
		double res = calc4.division(5,5);
		assertEquals(1, res, 0);
	}



}
