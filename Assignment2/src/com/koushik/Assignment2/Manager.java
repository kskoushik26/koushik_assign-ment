package com.koushik.Assignment2;

public  class Manager extends Employee
{
	public double incentive=1000;
  Manager(int Empid,double salary,String EmpName){
	 super( Empid, salary, EmpName);
  }
	@Override
	public double getsalary() {
		salary=salary+this.incentive;
		return salary;
	}
	
}
