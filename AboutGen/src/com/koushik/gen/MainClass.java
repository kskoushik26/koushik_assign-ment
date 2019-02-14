package com.koushik.gen;

public class MainClass
{
	public static void main(String[] args) 
	{
	   	 MyList<Integer> l1=new MyList<Integer>();
    	 l1.add(10);
    	 l1.add(20);
         l1.add(50);
         l1.add(40);
         l1.remove(1);
         l1.get(2);
         l1.getAll();
         
         MyList<String> s1 = new MyList<String>();
         s1.add("hello");
         s1.add("hiii");
         s1.add("Ashik");
         s1.remove(0);
         s1.get(1);
         s1.getAll();
	}
		
	}


