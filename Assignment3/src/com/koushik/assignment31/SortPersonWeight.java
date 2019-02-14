package com.koushik.assignment31;
import java.util.TreeSet;

public class SortPersonWeight
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet<Person> ts=new TreeSet<Person>(new MyComp());
    ts.add(new Person("Sehwag",64.02,164.75));
    ts.add(new Person("rahul",70.02,160.75));
    ts.add(new Person("Sachin",72.02,168.75));
    ts.add(new Person("Dravid",64.02,165.75));
    for(Person p:ts){
    	System.out.println(p);
    }
    
	

	}}
