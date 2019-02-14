package com.koushik.gen;


import java.util.ArrayList;

public class MyList<T> 
{
		ArrayList<T> al = new ArrayList<T>();
		
		public void add(T a)
		{
			al.add(a);
		}
         public void remove( int i){	
        	 al.remove(i);
         }
         public void get(int i){
        	System.out.println(al.get(i)); 
        }
         public void getAll()
         {
        	 System.out.println(al);
         }
}


