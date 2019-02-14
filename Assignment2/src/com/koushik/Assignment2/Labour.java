package com.koushik.Assignment2;

public class Labour extends Employee
{
	double overtime=2000;
public Labour(int Empid, double salary, String EmpName) {
		super(Empid, salary, EmpName);
	}

@Override
public double getsalary() {
	salary=salary+this.overtime;
	return salary;
}
	

}
