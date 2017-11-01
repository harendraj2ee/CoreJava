package com.tech.binding;


class A
{
	public void  display()
	{
		System.out.println("In A");
	}
	public void display(String args)
	{
		System.out.println("Welcome Binding Test Program");
	}
	public static void invoke(A x) // class level access method by static 
	{
		x.display();	//How this method call be binded
	}
}