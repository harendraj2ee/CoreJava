/*Names of a source and a target files are received as command line arguments, contents of the source file are used
in one go and copied to the target file */
package com.tech.InputOutput;
import java.io.*;
class Copy
{
	public static void main(String arr[])
	{
		if(arr.length<2)
		{
			System.out.println("Usage : Java copy src target.");
			System.exit(0);
		}
		try
		{
			//Stream to read bytes from the source file
			FileInputStream fis=new FileInputStream(arr[0]);
			//Stream to write bytes to the target file
			FileOutputStream fos=new FileOutputStream(arr[1]);
			//Time before the copy is started, is obtained
			long t1=System.currentTimeMillis();
			//A byte array equal to the size of source file is created
			byte b[]=new byte[fis.available()];
			//All the bytes of the source file are read into the array
			fis.read(b);
			//All the byte are write to the length file
			fos.write(b);
			//Both the streams are copied
			fis.close();
			fos.close();
			//Time after the copy is completed, obtained 
			long t2=System.currentTimeMillis();
			//Time to copy is obtained
			long t=t2-t1;
			System.out.println("Successfully copied in "+t+" MilliSeconds.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}