//De-Serilization
package serilization;
import java.io.*;
class ObjectReader
{
	public static void main(String arr[])throws Exception
	{
		System.out.println("ObjectInputStream Created. ------------");
		ObjectInputStream o1=new ObjectInputStream(new FileInputStream("emp.data"));
		Emp e1=(Emp)o1.readObject();
		Emp e2=(Emp)o1.readObject();
		System.out.println("Details of Object.");
		e1.display();
		e2.display();
	}
}