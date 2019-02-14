package com.koushik.assignment33;

import java.util.*;


public class ArrayListEX 
{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		al.add(10);
		al.add(23);
		al.add(25);
		al.add(30);
		al.add(50);
		ListIterator<Integer> itr=al.listIterator();
		System.out.println("Elements are arranged in Normal Order");
		while(itr.hasNext())
		{
		System.out.print( itr.next()+" ");	
		}
		System.out.println(" "); 
		System.out.println("Elements are arranged in Reverse Order");
		
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+ " "); 	
		}
		
	}
	
	
}
