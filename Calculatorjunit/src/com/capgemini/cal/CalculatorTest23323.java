package com.capgemini.cal;

import static org.junit.Assert.*;


import org.junit.*;

public class CalculatorTest23323 {

       Calculator c1=new Calculator();
    @BeforeClass
	public void testAddition() {
		double res=c1.addition(5, 5);
		 assertEquals(10, res , 0);
		 System.out.println("beforeclass");
	}
    
	@Before
	public void testSubstraction() {
		double res=c1.substraction(5, 5);
		assertEquals(0, res, 0);
		System.out.println("before");
	}

	@Test 
	public void testMultiplication() {
		double res=c1.multiplication(5, 5);
		assertEquals(25,res, 0);
		System.out.println("test method");
		
	}


	@After
	public void testDivision() {
		double res=c1.division(5, 5);
		assertEquals(1, res, 0);
		System.out.println("after");
	}

}
