package com.koushik.assignment2;

import java.util.ArrayList;

public class Order1 
{
   public static void main(String[] args) {
	ArrayList<Orders> al=new ArrayList<Orders>();
	 Orders o1=new Orders("Shirts",5000,true);
	  al.add(o1);
	  Orders o2= new Orders("Mobile",50000,true);
	  al.add(o2);
	  Orders o3= new Orders("Shoes",3500,false);
	  al.add(o3);
	  Orders o4 =new Orders("watch",1100,false);
	  al.add(o4);
	  
	 
		  

}
}
