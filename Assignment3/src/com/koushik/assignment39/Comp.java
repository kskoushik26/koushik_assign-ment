package com.koushik.assignment39;
import java.util.Comparator;

public class Comp implements Comparator<SavingsAccount>
{
	@Override
	public int compare(SavingsAccount sa1,SavingsAccount sa2) {
		// TODO Auto-generated method stub
		if(sa1.getAccountNo() >sa2.getAccountNo() ){
			return 1;
		}
		else 
		
		return -1;
	}

}
