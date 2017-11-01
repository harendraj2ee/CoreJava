//Serilization
package serilization;
import java.io.*;
class ObjectCreater
{
	public static void main(String arr[])
	{
		System.out.println("Creating objects------------");
		Emp e1=new Emp("Amit","Trainer",33333);
		Emp e2=new Emp("Harry","Manager",40000);
		e1.display();
		e2.display();
		System.out.println("Creating ObjectStream. -----------");
		try
		{
			ObjectOutputStream s1=new ObjectOutputStream(new FileOutputStream("emp.data"));
			s1.writeObject(e1);
			s1.writeObject(e2);
		}
		catch(Exception e)	{	}
	}
}