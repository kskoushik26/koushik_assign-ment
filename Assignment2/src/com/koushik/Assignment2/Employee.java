package com.koushik.Assignment2;

public abstract class Employee 
{   
	private int Empid;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	protected double salary;
     protected String EmpName;	
	public Employee(int Empid,double salary,String EmpName)
	{    
		this.Empid=Empid;
		this.salary=salary;
		this.EmpName=EmpName;
		
	}
	public abstract double getsalary();
  public double salary()
  {
	  System.out.println("the salary of "+EmpName+" is "+salary);
	  return salary;
  }
  
}
