package serilization;
import java.io.*;
class MakDir
{
	public static void main(String arr[])
	{
		if(arr.length==0)
		{
			System.out.println("Usage : Java MakDir Name/Path.");
			System.exit(0);
			
		}
		//File object is created for the given name or path
		File f=new File(arr[0]);
		if(f.exists() && f.isDirectory())
			System.out.println("Already exits.");
		else if(f.mkdir())
			System.out.println("Source folder is  Created Successfully.");
		else
			System.out.println("Can not be created.");
	}
}