package com.tech.mentro;
// Following Example Demonstrate the name conflict between Local variable & Data Member
 
class AB
{
	int a,b;
	public AB(int a,int b)
	{
		a=a;
		b=b;
	}
	public void display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

	public static void main(String arr[])
	{
		AB x=new AB(5,6);
		x.display();
	}
}