package com.onkar.Test;

import com.onkar.bank.BankAccount;
import com.onkar.bank.CurrentAccount;
import com.onkar.bank.SavingsAccountVer2;
import com.onkar.bank.SavingsBankAccount;

public class TestBankAccount 
{
  //public static void  testBankAccountMethod()
	  {
		//  BankAccount acc =new BankAccount();
		//  acc.setAccountHolderName("sachin");
	  }
   public static void  testSavingsBankAccount()
   {
	   SavingsBankAccount savingsacc = new SavingsBankAccount("onkar",5000);
	   System.out.println("acc number is "+savingsacc.getAccountNo());
	   System.out.println("acc balance is "+savingsacc.getAccountBalance());
	   savingsacc.deposit(5000);
	   System.out.println("acc balance is "+savingsacc.getAccountBalance());
	   System.out.println("=================");
	   savingsacc.withdraw(3000);
	   System.out.println("acc balance is "+savingsacc.getAccountBalance());
	   }
   public static void  testCurrentAccount()

   {
	   CurrentAccount currentacc = new CurrentAccount("omkar",40000);
	   System.out.println("acc number is "+currentacc.getAccountNo());
	   System.out.println("acc balance is "+currentacc.getAccountBalance());
	   //currentacc.deposit(5000);
	  // System.out.println("acc balance is "+currentacc.getAccountBalance());
	   System.out.println("=================");
	   currentacc.withdraw(50000);
	   System.out.println("acc balance is "+currentacc.getAccountBalance());
	   }
  public static  BankAccount  getBankAccount(String accountType){
	  BankAccount acc=null;
	  if (accountType.equals("saving")){
		  acc= new SavingsBankAccount("onkar",4000);
		  }
	  else if (accountType.equals("current")){
		  acc=new CurrentAccount(" rahul ",7000);
	  }
	  else {
		  acc=null;
	  }
	  return acc;
	  
  }
  
   
   public static void main(String[] args) 
  {
	SavingsAccountVer2 acc =new SavingsAccountVer2();
	acc.withdraw(4000);
	acc.deposit(4000);
	acc.isSalaryAccount();
	acc.getInsuranceName();
}
	   
   }

