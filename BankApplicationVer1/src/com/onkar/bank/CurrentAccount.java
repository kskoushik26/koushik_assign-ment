package com.onkar.bank;

public class CurrentAccount extends BankAccount {
	private double odLimit;
	{
		this.odLimit = 20000;
	}

	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	}

	public double getodLimit() {
		return odLimit;
	}

	public void withdraw(double amount) {
		if ((odLimit + this.accountBalance) >= amount) {
			if (amount <= this.accountBalance) {
				this.accountBalance = this.accountBalance - amount;
			} else {
				double extraAmt = this.accountBalance - amount;
				odLimit = odLimit + extraAmt;
			}
		} else if ((odLimit + this.accountBalance) < amount) {
			System.out
					.println("amount to with draw is toooo much. exceeds ODlimit too!");
		} else if (amount < 0) {
			System.out.println(" invalid amount");
		}

	}

}
