package com.java.order;
import java.util.Scanner;


public class AscendingOrder
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    int length=sc.nextInt();
    int num[]= new int[length];
     System.out.println("enter the element");
     for(int i=0;i<length;i++)
     {
    	num[i]=sc.nextInt();
     }
      
     for(int i=0;i<length-1;i++)
     {
    	 for (int j=0;j<length-1;j++)
    		 {
    		 int temp;
    		if (num[j]<num[j+1])
    		{
    			temp=num[j];
    		    num[j+1]=num[j];
    		    num[j]=temp;
    			
    			}
    				 
    		 }
    	 System.out.println("des");
    	 for (int k = 0; k <length; k++) {
    		 System.out.println(num[k]);
		}
    	 System.out.println("asc");
    	 for (int j = length-1; j >=0; j--) {
    		 System.out.println(num[j]);
		}
     }
}
}