/*Names of a source and a target files are received as command line arguments, contents of the source file are read are read
byte by byte and copied to the target file */
package com.tech.InputOutput;
import  java.io.*;
class ByteCopy
{
	public static void main(String arr[])
	{
		if(arr.length<2)
		{
			System.out.println("Usage : java ByteCopy src target.");
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
			while(true)
			{
				//A byte read from the source file
				int b=fis.read();
				//if it is -1, loop is breaked
				if(b==-1)
					break;
				//Otherwise the byte is written to the target file
				fos.write(b);
			}
			fis.close();
			fos.close();
			//Time after the copy is completed, is obtained
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