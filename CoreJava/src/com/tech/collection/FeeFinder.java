package com.tech.collection;

import java.util.*;
import java.io.*;
class FeeFinder
{
	public static void main(String arr[])
	{
		Properties p=new Properties();
		//Loading Properties from fee.properties file
		try
		{
			p.load(new FileInputStream("fee.properties"));
			Scanner in=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter course name to find fee, ennd to terminate : ");
				String key=in.nextLine();
				if(key.equalsIgnoreCase("end"))
					break;
				String value=p.getProperty(key);
				if(value==null)
					System.out.println("Invalid Course : ");
				else
					System.out.println("Fee is : "+value);
			}
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}