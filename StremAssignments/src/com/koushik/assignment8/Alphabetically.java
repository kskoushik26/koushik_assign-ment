package com.koushik.assignment8;

import java.util.ArrayList;


public class Alphabetically 
{
   public static void main(String[] args) {
		ArrayList<Trade> all= new ArrayList<>();
		all.add(new Trade("Cena","Banglore"));
		all.add(new Trade("Jhon","Pune"));
		all.add(new Trade("TripleH","Delhi"));
		all.add(new Trade("Kane","Pune"));
		all.add(new Trade("StoneGold","Banglore"));
		all.add(new Trade("GoldBerg","Indore"));
		  all.stream().map(x->x.getName()).sorted().forEach(t->System.out.println(t));
}
}
