package com.koushik.assignment3;

import java.util.function.Supplier;

public class SupplierTest 
{
	public static void main(String[] args) {
		Person p1=new Person("Kiran",22,90909090);
		Supplier<Person> supplier = ()->  p1 ;
		System.out.println( supplier.get());
	
		
       // Person p = supplier.get();
       // System.out.println(" Name -- "+p.getName()+", age -- "+p.getAge()+", Phone Number -- "+p.getPhNo());
	
	}

}
