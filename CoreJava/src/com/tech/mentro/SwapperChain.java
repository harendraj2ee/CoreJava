package com.tech.mentro;
// method chaining approach:----
class SwapperChain
{
	int a,b;
	public SwapperChain(int a, int b)
	{
		this.a=a;
		this.b=b;
		//Each constructor implicitly returns this i.e. implicit return type of each constructor is its class type.
	}
	public SwapperChain display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		return this;	//To facilitate method chaining.
	}
	public SwapperChain swap()
	{
		System.out.println("After Swapping :");
		int c=a;
		a=b;
		b=c;
		return this;	//To facilitate method chaining.
	}
	public static void main(String arr[])
	{
		//SwapperChain s=new SwapperChain(5,6);
		//s.display().swap().display();	//method Chaining approach.
		
		new SwapperChain(7,8).display().swap().display(); //Constructor & method calls are chained together.
	}
}