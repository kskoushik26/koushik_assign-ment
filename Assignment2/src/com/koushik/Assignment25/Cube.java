package com.koushik.Assignment25;

public class Cube extends Shape
{
     public double side=4;
     public double AreaCube;
     public double PerimeterCube;
     @Override
	public double area() {
    	 AreaCube=6*side*side;
    	 System.out.println("area of cube "+AreaCube);
		return AreaCube;
	}

	@Override
	public double perimeter() 
	{
		return 0;
	}

}
