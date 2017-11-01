/*Name of file received as command line arguments, contents are Read Line by Line from the keyboard and saved
in the file using System.out.println()   */
package com.tech.InputOutput;
import java.io.*;
class CreateFile
{
	public static void main(String arr[])
	{
		if(arr.length==0)
		{
			System.out.println("Usage : Java CreateFile file .");
			System.exit(0);
		}
		try
		{
			//Stream to read lines from the keyboard
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//Stream to write Lines to the target file
			PrintStream fos=new PrintStream(new FileOutputStream(arr[0]));
			//A message is displayed on the console
			System.out.println("Enter text, end to terminate. :");
			//Reference of the console is Saved
			PrintStream temp=System.out;
			//out is redirected to the file 
			System.setOut(fos);
			while(true)
			{
				//A line is read from the keyboard
				String str=br.readLine();
				//if it is end, break the loop
				if(str.equalsIgnoreCase("end"))
				break;
				//Otherwise write the line to the file
				System.out.println(str);
				
				
			}
			//Both the streams are closed
			br.close();
			fos.close();
			//redirecting out back to the console
			System.setOut(temp);
			//displaying final message on the console
			System.out.println("Successfully created.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}