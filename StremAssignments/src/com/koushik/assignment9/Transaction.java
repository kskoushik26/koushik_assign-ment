package com.koushik.assignment9;

import com.koushik.assignment8.Trade;

public class Transaction
{
	Trade trader;
	int year;
	int value;
	public Transaction(int year, int value,Trade trader) {
		super();
		
		this.year = year;
		this.value = value;
		this.trader = trader;
	}
	
	public Trade getTrader() {
		return trader;
	}
	public void setTrader(Trade trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
