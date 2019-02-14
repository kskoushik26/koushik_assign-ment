package com.koushik.assignment6;

import java.util.ArrayList;

public class Up 
{
	public static void main(String[] args) {
		ArrayList<String> all=new ArrayList<String>();
		all.add("ricky");
		all.add("clark");
		all.add("warne");
		all.add("strac");
		
		all.replaceAll(String::toUpperCase);
		System.out.println(all);
		
		}

}
