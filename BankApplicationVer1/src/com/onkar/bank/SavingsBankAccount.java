package com.onkar.bank;

public class SavingsBankAccount extends BankAccount
{
	private boolean isSalaryAccount;
	
	public SavingsBankAccount(String accountHolderName,double accountBalance)
	{
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=true;
		}
	public  SavingsBankAccount()
	{
		this.isSalaryAccount=true;
	}
	public SavingsBankAccount (String accountHolderName,double accountBalance,boolean isSalaryAccount)
	{
		super(accountHolderName,accountBalance);
		this.isSalaryAccount=isSalaryAccount;
	}
	public boolean isSalaryAccount()
	{
		return isSalaryAccount;
	}
}
