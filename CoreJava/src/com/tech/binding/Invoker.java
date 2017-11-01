package com.tech.binding;
// Referencing Party
class Invoker
{
	public static void invoke(Printable x)
	{
		x.print();
	}

	public static void invoke(B y) {
		// TODO Auto-generated method stub
		
	}
}
interface Printable
{
	void print();
}