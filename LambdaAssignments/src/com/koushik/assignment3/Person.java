package com.koushik.assignment3;

public class Person 
{
	public String name;
	public int age;
	public int PhNo;
	public Person(String name, int age, int phNo) {
		super();
		this.name = name;
		this.age = age;
		this.PhNo = phNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+name+"  age "+age+" phno "+PhNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhNo() {
		return PhNo;
	}
	public void setPhNo(int phNo) {
		PhNo = phNo;
	}

}
