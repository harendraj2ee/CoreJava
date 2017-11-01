/*Name of a class which contains a non-static method named display() is received as command line argurment. The class
is loaded, instantiated and its display() method is invoked.*/
import java.lang.reflect.*;
class Invoker1
{
	public static void main(String arr[])
	{
		if(arr.length==0)
		{
			System.out.println("Usage : Java Invoker className.");
			System.exit(0);
		}
		try
		{
			//This class is dynamically loaded.
			Class c=Class.forName(arr[0]);
			//Reference of the method object of display() is obtained
			Method m=c.getDeclaredMethod("display",null);
			//display() method is made accessible
			m.setAccessible(true);
			//Reference of the Constructor object of default constructor is obtained 
			Constructor ctr=c.getDeclaredConstructor(null);
			//Constructor is made Accessible
			ctr.setAccessible(true);
			//An object of the object is get created indirectly with the help of constructor is obtained 
			Object obj=ctr.newInstance();
			//display() method i indirectly invoked with the help of the method object
			m.invoke(obj,null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class A1
{
	public A1()
	{
		System.out.println("Object of A1 is Created.");
	}
	public void display()
	{
		System.out.println("disply() of A1 is invoked.");
	}
}
class B1
{
	public B1()
	{
		System.out.println("Object of B1 is created.");
	}
	public void display()
	{
		System.out.println("display() of B1 is invoked.");
	}
}