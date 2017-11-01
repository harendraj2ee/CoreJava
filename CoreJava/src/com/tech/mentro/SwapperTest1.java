package com.tech.mentro;
class Number
{
	int value;
	public Number(int x)
	{
		value=x;
	}
}
class SwapperTest1
{
	public static void main(String arr[])
	{
		Number a=new Number(5);
		Number b=new Number(6);
		System.out.println("a = "+a.value);
		System.out.println("b = "+b.value);
		
		Swapper.swap(a,b);
		System.out.println("After Swapping : ");
		System.out.println("a = "+a.value);
		System.out.println("b = "+b.value);
	}
}
class Swapper
{
	public static void swap(Number x, Number y)
	{
		int z;
		z=x.value;
		x.value=y.value;
		y.value=z;
	}
}