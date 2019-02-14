package com.koushik.assignment32;

import java.util.HashSet;

public class HashSetEX {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<>();
		h.add("A");
		h.add("10");
		h.add("B");
		h.add("java");
		h.add(null);
		System.out.println(h);
		System.out.println("No Insertion Order Fallowed");
	}
}
