package com.koushik.assignment4;

import java.util.ArrayList;

public class OddLength 
{
	public static void main(String[] args) {
		ArrayList<String> odd = new ArrayList<>();
		odd.add("hello there");
		odd.add("java");
		odd.add("HI");
		odd.add("Parking");
		odd.add("yellow");
			
	   odd.removeIf(s->((s.length())%2) != 0);
	    System.out.println(odd);
	   for(String s:odd)
	   System.out.println(s);
	   
	}


}
