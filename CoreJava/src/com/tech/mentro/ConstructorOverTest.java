package com.tech.mentro;
//Rectangle class Overload Constructor
class ConstructorOverloadRect
{
private int l,b;
	public void display()
	{
	System.out.println("Length is = "+l);
	System.out.println("Breadth is = "+b);
	}
	public int area()
	{
		return l*b;
	}
	public ConstructorOverloadRect(int x, int y)	//Parameterized Constructor
	{
		l=x;
		b=y;
	}
	public ConstructorOverloadRect()	//Default Constructor
	{
		l=2;
		b=3;
	}
}
class ConstructorOverTest
{
	public static void main(String arr[])
	{
		ConstructorOverloadRect r1=new ConstructorOverloadRect(8,9);
		ConstructorOverloadRect r2=new ConstructorOverloadRect();
		System.out.println("Dimension of Rectangle r1 is : ");
		r1.display();
		System.out.println("Dimension of Rectangle r2 is : ");
		r2.display();
		System.out.println("Area of r1 : "+r1.area());
		System.out.println("Area of r2 : "+r2.area());
	}
}