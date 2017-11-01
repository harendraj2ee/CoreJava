/* Two integers are received as command line arguments the first integer is divider by the second and the result is display on
the console */
package com.tech.exception;
class Divider
{
	public static void main(String arr[])
	{
		try
		{
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			int c=a/b;
			System.out.println("Result is : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second number must be non Zero.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Two arguments must be provided as input.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Arguments must be numeric.");
		}
	}
}