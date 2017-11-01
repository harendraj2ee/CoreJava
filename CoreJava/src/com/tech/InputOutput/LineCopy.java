/*Name of a Source and target files are received as command line arguments contents of the souurce file are read Line by Line
and copied to the target file	*/
package com.tech.InputOutput;
import java.io.*;
class LineCopy
{
	public static void main(String arr[])
	{
		if(arr.length<2)
		{
			System.out.println("Usage : Java LineCopy src target.");
			System.exit(0);
		}
		try
		{
			//Stream to read data line by line from the source file
			BufferedReader fis=new BufferedReader(new InputStreamReader(new FileInputStream(arr[0])));
			//Stream to write data line by line to the target file
			PrintStream fos=new PrintStream(new FileOutputStream(arr[1]));
			//Time before the copy is started is obtained
			long t1=System.currentTimeMillis();
			while(true)
			{
				//A Line is read from the source file.
				String str=fis.readLine();
				//if it is null, Loop is breaked.
				if(str==null)
					break;
				//Otherwise the line is written to the target file 
				fos.println(str);
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
