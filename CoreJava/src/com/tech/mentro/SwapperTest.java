package com.tech.mentro;
class Swapper
{
	public static void swap(int x, int y)
	{
		int z=x;
		x=y;
		y=z;
		
	}
}
class SwapperTest
{
	public static void main(String arr[])
	{
		int a=5,b=6;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		Swapper.swap(a,b);
		System.out.println("After Swapping is : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}