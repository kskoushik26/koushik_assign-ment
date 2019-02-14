package com.koushik.Assignment1;


public class ArithmaticOperation 
  {
	public static void main(String[] args) {
	Arithmatic addition=(a,b)-> a+b;
	Arithmatic substraction=(a,b)->a-b;
	Arithmatic multiplication=(a,b)->a*b;
	Arithmatic divison=(a,b)->a/b;
	System.out.println("addition operation "+addition.ArithMethod(100, 200));
	System.out.println("substraction operation "+substraction.ArithMethod(100, 200));
	System.out.println("multiplication operation "+multiplication.ArithMethod(100, 200));
	System.out.println("divison operation "+divison.ArithMethod(100, 200));
	
	
}


}
