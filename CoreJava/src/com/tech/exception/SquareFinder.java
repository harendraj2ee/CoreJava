

/* An Integer is received as command line argument if it is b/w 10 to 100, its square is displayed otherwise OutOfRangeException
is throw */
package com.tech.exception;

class SquareFinder
{
	public static void main(String arr[])
	{
		try
		{
			int a=Integer.parseInt(arr[0]);
			if(a<10 || a>100)
				throw(new OutOfRangeException("Valid range is 10 to 100."));
			int s=a*a;
			System.out.println("Square is : "+s);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}