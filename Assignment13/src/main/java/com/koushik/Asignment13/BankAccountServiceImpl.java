package com.koushik.Asignment13;

import java.util.List;

public class BankAccountServiceImpl   implements BankAccountService
{
	List<BankAccount> ac;


	public List<BankAccount> getAc() {
		return ac;
	}

	public void setAc(List<BankAccount> ac) {
		this.ac = ac;
	}


	@Override
	public double withdraw(long accountId, double balance) {
		double mybal=0;
		for(BankAccount acc:ac)
		 {
			 if((acc.getAccountId()==accountId)&&(acc.getAccountBalance()>balance)){
				 mybal=acc.getAccountBalance()-balance;	 
			 }
		 }
		return mybal;
	}
	@Override
	public double deposit(long accountId, double balance) {
		
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		return false;
	}

}
