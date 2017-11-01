
package com.tech.binding;
class B extends A
{
	public void display()
	{
		System.out.println("In B ");
	}
}
class C extends A
{
	public void display()
	{
		System.out.println("In C ");
	}
	
}
 public class BindingTest
{
	public static void main(String arr[])
	{
		A x=new A();
		B y=new B();
		C z=new C();
		
		A.invoke(x);
		A.invoke(y);
		A.invoke(z);
	}
}
