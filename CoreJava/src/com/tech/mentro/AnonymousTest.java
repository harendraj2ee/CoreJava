package com.tech.mentro;
// Find out the output of following class Anonymous program
class AnonymousTest
{
int a;
	private AnonymousTest(int x)	// Private parameterized Constructor
	//public AnonymousTest(int x)
	{
		System.out.println("Initialization of AnonymousTest Object Statred. ");		//Print Line 3,6
		a=x;
	}
	public void display()
	{
		System.out.println("a = "+a);
	}
	{
		System.out.println("Common initialization started.");	//Print Line 1,4
	}
	public static void main(String arr[])
	{
		AnonymousTest x=new AnonymousTest(5);
		AnonymousTest y=new AnonymousTest(10);
		x.display();
		y.display();
	}
	{
		System.out.println("Common initialization Ended.");		//Print Line 2,5
	}
}
//output a=5
// b=10