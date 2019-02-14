package com.koushik.assignment5;
import java.util.ArrayList;
import java.util.function.Function;

public class FirstLetter 
{
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Shawn Michaels");
	list.add("Jhon Cena");
	list.add("KurtAngle");
	list.add("RandyOrton");
	
	System.out.println(constructString(list,(i) -> i.substring(0,1)));
	
	}
	static StringBuilder constructString(ArrayList<String> a,Function<String,String> p)
	{
	  StringBuilder str = new StringBuilder();
	  for(String i:a)
	  {
		  str.append(p.apply(i));
	  }
	  return str;
	     
	}

}

