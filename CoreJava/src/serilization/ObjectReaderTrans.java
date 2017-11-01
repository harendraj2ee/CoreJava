//De-Serilization
package serilization;
import java.io.*;
class ObjectReaderTrans
{
	public static void main(String arr[])throws Exception
	{
		System.out.println("ObjectInputStream Created. ------------");
		ObjectInputStream o1=new ObjectInputStream(new FileInputStream("empTrans.data"));
		EmpTransient e1=(EmpTransient)o1.readObject();
		EmpTransient e2=(EmpTransient)o1.readObject();
		System.out.println("Details of Object.");
		e1.display();
		e2.display();
	}
}