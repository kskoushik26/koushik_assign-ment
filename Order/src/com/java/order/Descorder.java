package com.java.order;

import java.util.*;

public class Descorder 
{
	public static void main(String[] args)
	{
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		  for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
		  System.out.print("Ascending Order:");
		    for (int i = 0; i < n - 1; i++) 
		    {
		        System.out.print(a[i] + ",");
		    }
		    System.out.print(a[n - 1]);
		
	}  
}


