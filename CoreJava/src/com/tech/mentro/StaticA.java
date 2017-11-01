package com.tech.mentro;
class StaticA
{
	public void m1()
	{
		System.out.println("m1() is invoked. ");
	}
	public static void m2()
	{
		System.out.println("m2() is invoked.");
	}
	public static void main(String arr[])
	{
		//m1(); //won't compile m1() is non-static can't be direclty reference from a static blocks.
		m2(); 	// m2() can be directly access.
		
		StaticA x=new StaticA(); 
		x.m1();  //m1() can be invoked from a static context through an object eg.
	}
	
}