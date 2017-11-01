package com.tech.mentro;
class Person
{
	private String name;	//instance attribute
	private static int counter;		//class attribute
	static 	//class initializer
	{
		counter=0;	//object initializer
	}
	public Person(String n)
	{
		name=n;
		counter++;
	}
	public String getName()		//object behaviour
	{
		return name;
	}
	public static int getCounter()	//class's behaviour
	{
		return counter;
	}
}
class PersonTest
{
	public static void main(String arr[])
	{
		System.out.println("Creating some Person object......");
		Person p1=new Person("A");
		Person p2=new Person("B");
		System.out.println(Person.getCounter()+ " Person object are created.");
		System.out.println("Name of First Person is : "+p1.getName());
		System.out.println("Name of Second Person is : "+p2.getName());
	} 
}