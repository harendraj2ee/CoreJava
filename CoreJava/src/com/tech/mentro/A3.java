package com.tech.mentro;
class A extends Object
{
	public A()
	{
		super(); //super(); Modification made by the compiler
		System.out.println("In A");
	}
}
class B extends A
{
	 B()	// B() Modification made by the compiler
	{
		super();
	}
}
class C extends B
{
	public C()
	{
		super();	//super(); Modification made by the compiler
		System.out.println("In C");
	}
}
class A3
{
	public static void main(String arr[])
	{
		A x=new A();
		B y=new B();
		C z=new C();
	}
}