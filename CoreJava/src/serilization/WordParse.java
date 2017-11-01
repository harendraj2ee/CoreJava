package serilization;
import java.util.*;
import java.io.*;

class WordParse
{
	public static void main(String arr[])
	{
		if(arr.length<0)
			System.out.println("Usage : java WordParse FileName.");
		try
		{
			//FileStream is created to read file from users
			FileInputStream fis =new FileInputStream(arr[0]);
			//Read All bytes fromm a File
			byte b[]=new byte[fis.available()];
			fis.read();
			fis.close();
			//Get String from byte array
			String s1=new String(b);
			//Obtain the String Tokenizer class Object by passing words with delimeters.
			StringTokenizer t1=new StringTokenizer(s1,",./;");
			//Traversing of Tokens from the String 
			while(t1.hasMoreTokens())
				System.out.println(t1.nextToken());
		}
		catch(Exception e)	{	}
	}
}