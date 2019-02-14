package com.onkar.bank;

public class SavingsAccountVer2  extends SavingsBankAccount implements Insurance
{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan Bima";
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 5_00_000;
	}

}
