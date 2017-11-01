package com.tech.mentro;
// Following Example Demonstrate the name conflict between Local variable & Data Member
class AB1
{
	int a, b;
	public AB1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void main(String arr[])
	{
		AB1 x=new AB1(5,6);
		x.display();
	}
} 