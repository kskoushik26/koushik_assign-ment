package com.koushik.assignment32;

import java.util.LinkedHashSet;

public class LinkedHashSetEX 
{
	public static void main(String[] args) {
		LinkedHashSet<Comparable> s=new LinkedHashSet<Comparable>();
		s.add(10);
		s.add("a");
		s.add("A");
		s.add(null);
		System.out.println(s);
		System.out.println(" Insertion Order Fallowed");
		
	}

}
