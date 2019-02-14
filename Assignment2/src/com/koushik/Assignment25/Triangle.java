package com.koushik.Assignment25;
public class Triangle extends Shape
{
	public double Areatriangle;
    public double height=4;
    public double base=5;
    public double side=6;
    public double perimetertriangle;
	@Override
	public double area() {
		Areatriangle=0.5*base*height;
		System.out.println("area of TRIANGLE "+Areatriangle);
		return Areatriangle;
	}

	@Override
	public double perimeter() {
		perimetertriangle=height+base+side;
		System.out.println("perimeter of square "+perimetertriangle);
		return perimetertriangle;
	}

}


