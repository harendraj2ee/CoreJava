package com.tech.collection;

class A <T>
{
	T value;
	public A(T x)
	{
		value=x;
	}
	public void display()
	{
		System.out.println(value);
	}
	public T getValue()
	{
		return value;
	}
}
class Generic 
{
	public static void main(String arr[])
	{
		A <String> strObj=new A<String>("A is Generic.");
		A<Integer> intObj=new A<Integer>(6);
		System.out.println("Value of strObj : ");
		strObj.display();
		System.out.println("Value of intObj : ");
		intObj.display();
		System.out.println("Assigning the value of strObj to a String. -------------------");
		String str=strObj.getValue();
		/* Makes sense, must be allowed and is allowed because for strObj return types of the method is String. Explicit
		Conversion isn't  required. */
		
		System.out.println("Assigning the value of intObj to strObj. -----------------");
		//strObj=intObj;
		
		/* Incompatible types, must not be assigned and isn't assigned because the compiler knows that these
		Objects have different types of values */
	}
}