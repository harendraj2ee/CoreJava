package com.tech.mentro;
class Rectangle
{
private int l,b; 	//Attribute
	public void display()	//Behaviour
	{
	System.out.println("length = "+l);
	System.out.println("breadth = "+b);
	}
	public int area()
	{
	return l*b;
	}
	public void setDimension(int x, int y)
	{
	l=x;
	b=y;
	}
}
class RectangleTest
{
	public static void main(String arr[])
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.setDimension(5,6);
		r2.setDimension(7,8);
		System.out.println("Dimension of Rectangle r1 : ");
		r1.display();
		System.out.println("Dimension of Rectangle r2 : ");
		r2.display();
		System.out.println("Area of r1 = "+r1.area());
		System.out.println("Area of r2 = "+r2.area());
	}
}