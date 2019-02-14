package com.koushik.assignment9;

import java.util.ArrayList;

import com.koushik.assignment8.Trade;

public class Highest 
{
	public static void main(String[] args) {
		ArrayList<Transaction> al = new ArrayList<>();
		al.add(new Transaction( 2011, 100000,(new Trade("Cena","Banglore"))));
		al.add(new Transaction( 2012, 110000,(new Trade("Jhon","Pune"))));
		al.add(new Transaction( 2013, 120000,(new Trade("TripleH","Delhi"))));
		al.add(new Transaction( 2014, 130000,(new Trade("Kane","Pune"))));
		al.add(new Transaction( 2015, 140000,(new Trade("StoneGold","Banglore"))));
		al.add(new Transaction( 2016, 150000,(new Trade("GoldBeg","Indore"))));
		
		System.out.println(al.stream().map(p1->p1.getValue()).sorted((p1,p2)->{if(p1<(p2)){
			return 1;
		}
		return -1;}).findFirst());
	}


} 
