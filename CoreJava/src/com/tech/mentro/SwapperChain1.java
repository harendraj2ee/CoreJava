package com.tech.mentro;
// method chaining approach not directly call by :----
class SwapperChain1
{
	int a,b;
	public SwapperChain1(int a, int b)
	{
		this.a=a;
		this.b=b;
		//Each constructor implicitly returns this i.e. implicit return type of each constructor is its class type.
	}
	public SwapperChain1 display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		return this;	//To facilitate method chaining.
	}
	public SwapperChain1 swap()
	{
		System.out.println("After Swapping :");
		int c=a;
		a=b;
		b=c;
		return this;	//To facilitate method chaining.
	}
	public static void main(String arr[])
	{
		SwapperChain1 s=new SwapperChain1(5,6);
		s.display().swap().display();	//method Chaining approach.
		
		//new SwapperChain1(7,8).display().swap().display(); //Constructor & method calls are chained together.
	}
}