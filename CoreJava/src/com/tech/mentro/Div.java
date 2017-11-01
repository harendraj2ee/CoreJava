package com.tech.mentro;

public class Div {
	public static int divi(int x,int y)
	{
		try
		{
			return x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			throw(e);
		}
		
	}

	public static void main(String arr[])
	{
		try
		{
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			int c=divi(a,b);
			System.out.println("result is"+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
