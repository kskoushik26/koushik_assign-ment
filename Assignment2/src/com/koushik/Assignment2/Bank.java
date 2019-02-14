package com.koushik.Assignment2;

public class Bank
{
	private static  int autoaccountNumber;
	private   int accountNumber;
	private String  accountHolderName;
	protected double accountBalance;
	
   //init
   {
	    accountNumber=autoaccountNumber++;
   }
   Bank(String accountHolderName,double accountBalance)
   {
	   this.accountHolderName=accountHolderName;
	   this.accountBalance=accountBalance;
   }
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

}
