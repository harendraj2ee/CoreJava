/* Two integers are received as command line arguments the first integer is divider by the second and the result is display on
the console */
package com.tech.exception;

class Divider2
{
	public static void main(String arr[])
	{
		try
		{
			if(arr.length<2)
				throw(new ArrayIndexOutOfBoundsException("Two arguments must be provided."));
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			if(b==0)
				throw(new ArithmeticException("Second number must be non Zero."));
			int c=a/b;
			System.out.println("Result is : "+c);
		}
		catch(Exception e)	//Generalized Exception Handler
		{
			System.out.println(e);	//Description of the object is printed.
		}
	}
}