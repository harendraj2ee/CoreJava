package serilization;
import java.io.*;
class MakRename
{
	public static void main(String arr[])
	{
		if(arr.length==0)
		{
			System.out.println("Usage : Java MakRename Name/Path.");
			System.exit(0);
			
		}
		//File object is created for the given name or path to convert Rename folder
		File f1=new File(arr[0]);
		File f2=new File(arr[1]);
		if(!f1.exists() || f2.exists())
			System.out.println("Enter Source file does not exist or target already exits.");
		else if(f1.renameTo(f2))
			System.out.println("Successfully Reanme Folder.");
		else
			System.out.println("Can't be Rename Folder.");
	}
}
		