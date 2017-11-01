package com.tech.mentro;
// Swapping by Convetionally approach....
class SwapperConvention
{
	int a,b;
	public SwapperConvention(int a, int b)
	{
		this.a=a;
		this.b=b;
		//Each Constructor implicitly returns this i.e. implicit return type of each constructor is its class type
	}
	public void display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
	public void swap()
	{
		System.out.println("After Swapping ");
		int c=a;
		a=b;
		b=c;
	}
	public static void main(String arr[])
	{
		//Conventional Approach.....
		SwapperConvention sc=new SwapperConvention(15,20);
		sc.display();
		sc.swap();
		sc.display();
	}
}