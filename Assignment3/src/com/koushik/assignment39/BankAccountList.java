package com.koushik.assignment39;

import java.util.TreeSet;


public class BankAccountList 
{
	public static void main(String[] args) {
		TreeSet<SavingsAccount> sa=new  TreeSet<SavingsAccount> (new Comp());
		sa.add(new SavingsAccount(123,"Rahul", 10000));
		sa.add(new SavingsAccount(12,"Sachin", 10200));
		sa.add(new SavingsAccount(23,"Sehwag", 12000));

		System.out.println(sa);

		}

}
