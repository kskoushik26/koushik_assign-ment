package com.koushik.TestDateDifference;

import com.koushik.TestRecord.MyTestRecord;
import com.koushik.dateDifference.DatedifferenceProvider;
import com.koushik.mydate.MyDate;

public class TestDateDifference {
	public static void main(String[] args) 
	{
		DatedifferenceProvider provider= new DatedifferenceProvider();
		MyTestRecord[] myTestRecord = new MyTestRecord[2];
		myTestRecord[0]=new MyTestRecord(new MyDate(04,06,2011), new MyDate(04,06,2018),0);
		myTestRecord[1]=new MyTestRecord(new MyDate(18,04,2011), new MyDate(06,04,2011),12);
		
	for(int index=0; index < myTestRecord.length; index++){
		int calculatedDiff = DatedifferenceProvider.getDateDifference(myTestRecord[index].getStartDate(),
				myTestRecord[index].getEndDate());
		if (calculatedDiff == myTestRecord[index].getActualDifference()) {
			System.out.println("Test Case passed");
		} else {
			System.err.println("Test Case failed"+" Actual =" + myTestRecord[index].getActualDifference()+ " calculated ="+ calculatedDiff);
		}
	}
	}
}
