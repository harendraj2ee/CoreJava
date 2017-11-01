/* Two integers are received as command line arguments the first integer is divider by the second and the result is display on
the console */
package com.tech.exception;

class Divider1
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
		catch(Exception e)	//Generalized Exception Handler
		{
			System.out.println(e);	//(Description of the object is printed) working on toString() method call
		}
	}
}