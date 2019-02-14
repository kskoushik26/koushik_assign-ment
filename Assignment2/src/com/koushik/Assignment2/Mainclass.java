package com.koushik.Assignment2;

public class Mainclass
{
  public static void main(String[] args) {
	Manager e1=new Manager(1,20000,"Suresh");
	Labour e2=new Labour(2,15000,"Ramesh");
double a =	e1.getsalary();
System.out.println("the incentive salary is "+a);
	double b=e2.getsalary();
	System.out.println("the overtime salary is "+b);
}
}
