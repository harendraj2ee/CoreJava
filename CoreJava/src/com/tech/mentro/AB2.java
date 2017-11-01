package com.tech.mentro;
//Overloaded Constructor call program in a constructor
class AB2
{
	int a,b;
	public AB2()
	{
		this(2,3);
		System.out.println("In default Constructor.");
	}
	public AB2(int a)
	{
		this(a,3);
		System.out.println("In one Parameterized Constructor.");
	}
	public AB2(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("In Two Parameterized Constructor.");
	}
	public void display()
	{
		System.out.println("a = "+this.a);
		System.out.println("b = "+this.b);
	}
	public static void main(String arr[])
	{
		AB2 x=new AB2();
		x.display();
		AB2 y= new AB2(10);
		y.display();
		AB2 z=new AB2(20,30);
		z.display();
		
	}
}