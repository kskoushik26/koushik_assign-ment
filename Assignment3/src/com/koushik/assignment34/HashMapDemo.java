package com.koushik.assignment34;
import java.util.HashMap;
import java.util.Set;


public class HashMapDemo
{
	public static void main(String[] args) {


		HashMap<MyDate, String> hm=new HashMap<MyDate,String>();   
		
		
		System.out.println("Initial list of elements: "+hm); 
		MyDate rahulDob=new MyDate(11,12,2014);
		MyDate sachinDob=new MyDate(11,12,2015);
		MyDate VishnuDob=new MyDate(11,1,2016);
		hm.put(rahulDob,"Rahul");    
		hm.put(sachinDob,"Sachin"); 
		hm.put( VishnuDob,"Vishnu"); 
	
System.out.println(hm);
System.out.println("Name:"+get(rahulDob,hm ));
System.out.println("Name:"+get(sachinDob,hm ));
System.out.println("Name:"+get(VishnuDob,hm ));	
		
	}

	private static String get(MyDate obj,HashMap<MyDate, String>  hm) {
		// TODO Auto-generated method stub\
		Set<MyDate> dates=hm.keySet();
		MyDate[] d=(MyDate[]) dates.toArray(new MyDate[0]);
		
		
		for(MyDate i:d){
		if(obj.getDd()==i.getDd() && obj.getMm()==i.getMm() && obj.getYyyy()!=i.getYyyy() ){
		return "fail";
		}
	     }
		return (String) hm.get(obj);
}

}
