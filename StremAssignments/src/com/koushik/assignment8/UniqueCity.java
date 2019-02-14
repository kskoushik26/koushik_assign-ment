package com.koushik.assignment8;


import java.util.ArrayList;


public class UniqueCity 
{
	public static void main(String[] args) 
	{
		ArrayList<Trade> all= new ArrayList<>();
		all.add(new Trade("Cena","Banglore"));
		all.add(new Trade("Jhon","Pune"));
		all.add(new Trade("TripleH","Delhi"));
		all.add(new Trade("Kane","Pune"));
		all.add(new Trade("StoneGold","Banglore"));
		all.add(new Trade("GoldBerg","Indore"));
		
		System.out.println("Dinstinct cities:");
		all.stream().map(x->x.getCity())
		.distinct()
		.forEach(x->System.out.println(x));
		

}
}