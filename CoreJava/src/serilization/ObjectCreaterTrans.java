//Serilization
package serilization;
import java.io.*;
class ObjectCreaterTrans
{
	public static void main(String arr[])
	{
		System.out.println("Creating objects------------");
		EmpTransient e1=new EmpTransient("Sanjay","Teacher",33333);
		EmpTransient e2=new EmpTransient("Harendra","Developer",40000);
		e1.display();
		e2.display();
		System.out.println("Creating ObjectStream. -----------");
		try
		{
			ObjectOutputStream s1=new ObjectOutputStream(new FileOutputStream("empTrans.data"));
			s1.writeObject(e1);
			s1.writeObject(e2);
		}
		catch(Exception e)	{	}
	}
}