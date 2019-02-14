package com.koushik.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class colorwise 
{
	public static void main(String[] args) {
	        ArrayList<Fruit> arr = new ArrayList<>();
			arr.add(new Fruit("Apple", 50, 200, "Red"));
			arr.add(new Fruit("cherry", 200, 1000, "Red"));
			arr.add(new Fruit("Mango", 75, 150, "Yellow"));
			arr.add(new Fruit("Grape", 25, 50, "Black"));
			arr.add(new Fruit("ButterFruit", 250, 500, "Green"));
			System.out.println(arr);
			List<Fruit>  str = arr.stream()
					.collect(Collectors.toList());
			str.forEach(t->System.out.println(t.getColor()+":"+t.getName()));
	}

}
