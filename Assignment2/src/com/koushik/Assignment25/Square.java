package com.koushik.Assignment25;

public class Square extends Shape
{
	public double AreaSquare;
	public double PerimeterSquare;
	public double side=4;

	@Override
	public double area() {
		AreaSquare=side*side;
		System.out.println("area of square "+AreaSquare);
		return AreaSquare;
	}

	@Override
	public double perimeter() {
		PerimeterSquare= 4*side;
		System.out.println("Perimeter of square "+PerimeterSquare);
		return PerimeterSquare;
	}

 
}
