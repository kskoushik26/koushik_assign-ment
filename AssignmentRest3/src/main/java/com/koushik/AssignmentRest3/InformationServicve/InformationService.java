package com.koushik.AssignmentRest3.InformationServicve;

import java.util.ArrayList;
import java.util.List;


import com.koushik.AssignmentRest3.information.Information;

public class InformationService 
{
  
	public static List<Information> getAllInformation()
	{

		Information i1  = new Information("Banglore", "karnataka","India", 560010);
		Information i2  = new Information("Hyderbad", "Andra","India", 660660);
		Information i3  = new Information("chennai", "Tamilnadu","India", 111222);
		List<Information> list = new ArrayList<>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		return list;
		
	}
}
