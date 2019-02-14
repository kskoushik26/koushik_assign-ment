package com.koushik.Assignment2;

public class Singleton 
{
	String s;
 private static Singleton instance=null;

 private Singleton()
 {
	 s="ToSRTHW56HJ";
 }
 public static Singleton getInstance()
 {
	 if (instance==null)
		 instance= new Singleton();
	 System.out.println("hello");
	 return instance;
 }

 	public static void main(String[] args) {
 		Singleton x = Singleton.getInstance();
 		Singleton y = Singleton.getInstance();
 		Singleton z = Singleton.getInstance();
 		x.s=(x.s).toLowerCase();
 		y.s=(y.s).toUpperCase();
 		
 		System.out.println("singleton of x "+x.s);
 		System.out.println("singleton of y "+y.s);
 		System.out.println("singleton of z "+z);
 		
 		
 				}
 }


