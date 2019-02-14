package com.koushik.assignment310;

import java.util.ArrayList;
public class Test 
{
	public static void main(String[] args) {
		Movie_DetailsList list=new Movie_DetailsList();
		ArrayList<Movie_Details> al=new ArrayList<Movie_Details>();
		Movie_Details movie1=new Movie_Details("thevillian"," Sudeep"," Amyjackson","Action THRILLER");
		Movie_Details movie2=new Movie_Details("Tagaru","Shivanna"," Aishwarya","Action");
		Movie_Details movie3=new Movie_Details("MM2"," Ganesh","NehaShetty","Romantic");
		
		
		list.add_movie(movie1, al);
		list.add_movie(movie2, al);
		list.add_movie(movie3, al);
		
		
		System.out.println("after adding movies"+al);
		System.out.println("find movies by genre");
		list.find_movie_by_genre("Action", al);
		System.out.println("find movies by movie name");
		list.find_movie_by_name("Pelli Choopulu", al);
		System.out.println("after removing movies ");
		list.remove_movie(movie1, al);
		System.out.println(al);
		System.out.println("after all removing movies ");
		list.remove_Allmovie(al);
		System.out.println(al);
	}
}
