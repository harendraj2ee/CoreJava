/*Name of a class which contains a non-static method named display() is received as command line argurment. The class
is loaded, instantiated and its display() method is invoked.*/
import java.lang.reflect.*;
class Invoker
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
			Method m=c.getDeclaredMethod("display", null);
			//An object of the class is get created indireclty
			Object obj=c.newInstance();
			//display() method is indirectly invoking with the help of its method object
			m.invoke(obj,null);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
//Classes to test the Invoker
class A
{
	public A()
	{
		System.out.println("Object of A is Created.");
	}
	public void display()
	{
		System.out.println("disply() of A is invoked.");
	}
}
class B
{
	public B()
	{
		System.out.println("Object of B is created.");
	}
	public void display()
	{
		System.out.println("display() of B is invoked.");
	}
}
class C
{
	public C()
	{
		System.out.println("Object of C is created.");
	}
	public void display()
	{
		System.out.println("display() of C is invoked.");
	}
}