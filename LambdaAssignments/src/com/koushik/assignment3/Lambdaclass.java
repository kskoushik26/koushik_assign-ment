package com.koushik.assignment3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdaclass
{
	public static void main(String[] args) {
		String s="hii";
		String h="hello";
		Supplier<String> supp = ()-> s;
		System.out.println(supp.get());
		Consumer<String> cons = (arg1)->{};
		cons.accept(h);
		Predicate<Integer> p1=a->(a >= 20); 
	    System.out.println(p1.test(20)); 
	    Function<Integer,Integer> f1=(a)-> a*a;
	    System.out.println(f1.apply(3));
		
	}

}
