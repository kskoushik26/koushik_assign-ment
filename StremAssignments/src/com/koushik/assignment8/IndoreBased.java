package com.koushik.assignment8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class IndoreBased 
{
	public static void main(String[] args) {
		ArrayList<Trade> all= new ArrayList<>();
		all.add(new Trade("Cena","Banglore"));
		all.add(new Trade("Jhon","Pune"));
		all.add(new Trade("TripleH","Delhi"));
		all.add(new Trade("Kane","Pune"));
		all.add(new Trade("StoneGold","Banglore"));
		all.add(new Trade("GoldBerg","Indore"));
		all.stream().filter(t->t.getCity().equals("Indore")).collect(Collectors.toList()).forEach(a->System.out.println(a)); 
	
	}

}
