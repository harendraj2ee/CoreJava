package com.tech.collection;

class B
{
	Object value;
	public B(Object x)
	{
		value=x;
	}
	public void display()
	{
		System.out.println(value);
	}
	public Object getValue()
	{
		return value;
	}
}
class NonGeneric
{
	public static void main(String arr[])
	{
		B strObj=new B("B is NonGeneric.");
		B intObj=new B(6);
		System.out.println("Value of strObj : ");
		strObj.display();
		System.out.println("Value of intObj : ");
		intObj.display();
		System.out.println("Assigning the value of intObj to strObj. -------------");
		strObj=intObj;
		/* Incompatible types, must not be assigned but is assigned because the compiler doesn't know that these Object 
		have different types of values. For the compiler type of both the reference variable is same. */
		System.out.println("Assigning the value of strObj to a String. ----------");
		//String str=strObj.getValue();
		
		/* Makes sense, must be allowed but isn't allowed because for the compiler return type of the method is Object
		which can't be directly assigned to a String. Explicit conversion is required i.e. this statement need to writes
		String str = (String)strObj.getValue(); */
	}
}