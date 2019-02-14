package com.koushik.assignment8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SameCity {

	public static void main(String[] args) 
	{
		ArrayList<Trade> all= new ArrayList<>();
		all.add(new Trade("Cena","Banglore"));
		all.add(new Trade("Jhon","Pune"));
		all.add(new Trade("TripleH","Delhi"));
		all.add(new Trade("Kane","Pune"));
		all.add(new Trade("StoneGold","Banglore"));
		all.add(new Trade("GoldBerg","Indore"));
	all.stream().filter(i->i.getCity().equals("Pune")).collect(Collectors.toList()).forEach(t->System.out.println(t.getName()+":"+t.getCity()));
	}

}
