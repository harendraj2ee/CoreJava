/* Name of class is received as commmand line argument. The class is get loaded and information of its members is
displayed on the console */
import java.lang.reflect.*;
class Desc
{
	public static void main(String arr[])
	{
		if(arr.length==0)
		{
			System.out.println("Usage : Java Desc ClassName.");
			System.exit(0);
		}
		try
		{
			//The class is get dynamically loaded
			Class c=Class.forName(arr[0]);
			
			//Array of field objects of the class is obtained
			Field f[]=c.getDeclaredFields();
			//Details of the Field objects are displayed
			System.out.println("----------------------------------- Fields --------------------------------------");
			for(int i=0; i<f.length; i++)
				System.out.println(f[i]);
			
			//Array of constructor objects of the class is obtained
			Constructor ctr[]=c.getDeclaredConstructors();
			//Details of the Constructor object are displayed
			System.out.println("--------------------------------- Constructors -----------------------------------");
			for(int i=0; i<ctr.length; i++)
				System.out.println(ctr[i]);
			
			//Array of method objects of the class is obtained
			Method m[]=c.getDeclaredMethods();
			//Details of the Method objects are displayed
			System.out.println("----------------------------------- Methods --------------------------------------");
			for(int i=0; i<m.length; i++)
			
			System.out.println(m[i]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}