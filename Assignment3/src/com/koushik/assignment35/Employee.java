package com.koushik.assignment35;
import java.util.Hashtable;

public class Employee 
{
	private static int empid=0;
	private String name;
	Employee(String name){
		empid++;
		this.name=name;
		
	}
	
	 @Override
	    public boolean equals(Object obj) 
	    { 	       
	            return true; 
	    }
	 public int hashCode() {
	        
	        return 20;
	    }
	public static void main(String[] args) {
		Hashtable<Employee,String> h=new Hashtable<Employee,String>();
		Employee e=new Employee("Sehwag");
		Employee e1=new Employee("rahul");
		Employee e3=new Employee("Sachin");
		h.put(e,"firstEmployee");
		h.put(e1, "SecondEmployee");
		h.put(e3, "ThirdEmployee");
		 if (e.equals(e1)) 
	            {
			 System.out.println("both are equal"); 
	            }
		System.out.println(e.hashCode());
		System.out.println(h.get(e));
		System.out.println(h.get(e1));
		System.out.println(h.get(e3));
		
		

	}

}
