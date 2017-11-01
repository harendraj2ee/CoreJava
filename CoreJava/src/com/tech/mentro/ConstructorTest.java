package com.tech.mentro;
class RectConstructor
{
private int l,b;
	public void display()
	{
	System.out.println("Length = "+l);
	System.out.println("Breadth = "+b);
	}
	public int area()
	{
	return l*b;
	}
	public RectConstructor(int x, int y)		//Parameterized Constructor
	{
	l=x;
	b=y;
	}
}
class ConstructorTest
{
	public static void main(String arr[])
	{
		RectConstructor r1=new RectConstructor(10,8);
		RectConstructor r2=new RectConstructor(5,12);
		System.out.println("Dimension of Rectangle r1 : ");
		r1.display();
		System.out.println("Dimensionn of Rectangle r2 : ");
		r2.display();
		System.out.println("Area of r1 : "+r1.area());
		System.out.println("Area of r2 : "+r2.area());
	}
}