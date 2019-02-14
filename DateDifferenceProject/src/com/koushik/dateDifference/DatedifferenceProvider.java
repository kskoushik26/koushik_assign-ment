package com.koushik.dateDifference;

import com.koushik.mydate.MyDate;

public class DatedifferenceProvider {
	static final int JAN=31;
	static final int FEB=28;
	static final int MAR=31;
	static final int APR=30;
	static final int MAY=31;
	static final int JUN=30;
	static final int JUL=31;
	static final int AUG=31;
	static final int SEP=30;
	static final int OCT=31;
	static final int NOV=30;
	static final int DEC=31;
	int[] months = { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };
	public static int getDateDifference(MyDate startDate, MyDate endDate) {
	            return Math.abs(endDate.getDd() - startDate.getDd() );
	}


	}
	
