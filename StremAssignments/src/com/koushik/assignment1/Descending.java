package com.koushik.assignment1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Descending {
	public static void main(String[] args) {
		ArrayList<Fruit> arr = new ArrayList<>();
		arr.add(new Fruit("Apple", 50, 200, "Red"));
		arr.add(new Fruit("Mango", 75, 150, "Yellow"));
		arr.add(new Fruit("Grape", 25, 50, "Black"));
		arr.add(new Fruit("ButterFruit", 250, 500, "Green"));
		System.out.println(arr);
		System.out.println();
		List<Integer> str = arr.stream().filter(st -> st.getCalories() < 100).mapToInt(a->a.getCalories()).sorted().boxed()
				.collect(Collectors.toList());
		Collections.reverse(str);
		System.out.println(str);
		
	}

}
