package com.tech.exception;


class Divider3
{
	public static int divide(int x, int y)throws ArithmeticException
	{
		try
		{
			return x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is caught in divide rethrowing.....");
			throw(e);
		}
		
	}
	
	public static void main(String arr[])
	{
		try
		{
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			int c=divide(a,b);
			System.out.println("Result is : "+c);
		}
		catch(Exception e)
		{
			System.out.println("Following exception is caught in main.");
			System.out.println(e);
		}
		
	}
}