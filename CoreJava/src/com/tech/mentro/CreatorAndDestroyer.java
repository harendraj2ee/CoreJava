package com.tech.mentro;
//How to work with Understaing Finalize Method
class A
{
	static int counter;
	int no;
	public A()
	{
		no=++counter;
		System.out.println("Object "+no+ " of A is created.");
	}
	protected void finalize()
	{
		counter--;
		System.out.println("Object "+no+ " of A is being Destroyed.");
	}
}
class CreatorAndDestroyer
{
	public static void main(String arr[])throws Exception
	{
		System.out.println("Creating Some object of A.");
		
		
		A x=new A();
		new A();
		A y=new A();
		new A();
		new A();
		System.out.println("Creating the execution of the Garbage Collector(GC).......");
		System.out.println("Requesting the execution of the Garbage Collector......");
		System.gc();
		System.out.println("Suspending the execution of main so that GC can be executed...");
		Thread.sleep(1000);
		System.out.println("Execution of main resumed, "+A.counter+ " Objects of A are left.");
	}
}