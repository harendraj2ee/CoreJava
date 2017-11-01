package com.tech.mentro;
//Find out the Output of following class
class A
{
	static
	{
		System.out.println("A is initialized. ");	//Print Statement number : 3
	}
	public static void display()
	{
		System.out.println("display() of A invoked.");	//Print Statement number : 4
	}
}
 class B
{
	static
	{
		System.out.println("B is initialized.");	//Print Statement number : 9
	}
	public B()
	{
		System.out.println("Object of B is initialized.");	//Print Statement number : 10
	}
}
class C
{
	static int value;
	static
	{
		value=5;
		System.out.println("C is initialized.");	//Print Statement number : 6
	}
}
class D
{
	static
	{
		System.out.println("D  is initialized.");	//Print Statement number : 1
	}
	public static void main(String arr[])
	{
		System.out.println("Invoking display() of A.....");	//Print Statement number : 2
		A.display();
		System.out.println("Creating reference variable of B.");	//Print Statement number : 5
		B x;
		System.out.println("C.value is = "+C.value);	//Print Statement number : 7
		System.out.println("Creating Object of B......");	//Print Statement number : 8
		x=new B();
	}
}