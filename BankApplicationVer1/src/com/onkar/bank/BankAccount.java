package com.onkar.bank;

import java.util.Set;

//collection of logical classes

public abstract class BankAccount {
	//static variable
	private static int autoAccountNo;
	//instance variable
	//we cannot create acess instance variable without creating object
	private   int accountNo;
	private String  accountHolderName;
	protected double accountBalance;
	//init block
	{
		accountNo=++autoAccountNo;
	}
	 //constructor- intialization of instance(class) variable
	//Default constructor
	public BankAccount(){
		accountHolderName="unknown";
		accountBalance=0;
	
		
		
	}
	//parameterize constructor
	//constructor overloading
	public BankAccount(String accountHolderName, double accountBalance ){
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
  }
	//setter method- reintialise member variable
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public int getAccountNo() {
		return accountNo;
	}
		
		public void withdraw(double amount)
		{
			if(amount>this.accountBalance)
			{
				System.out.println("enter the amount less than account balance");
			}
			else if (amount<=0)
			{
				System.out.println("enter valid amount");
			}
			else if ((this.accountBalance-amount)<1000)
			{ 
				System.out.println("minimum balance should be 1000");
			}
			else {
				this.accountBalance-=amount;
			}
			
		}
	public void deposit(double amount)
	{
		if (amount<=0)
		{
			System.out.println("enter valid amount");
		}
		else{
			System.out.println("enter the amount"+amount);
			this.accountBalance+=amount;
			
		}
		
		
	
	}
	//public static void main(String[] args) {
	//  BankAccount acc=new BankAccount();
	  // BankAccount acc2=new BankAccount("onkar",5000);
	 // acc2.withdraw(4000);
	  // acc2.deposit(10000);
	  // double a=acc2.getAccountBalance();
	  // System.out.println("Account Balance is "+a);
			 
	  
	}

