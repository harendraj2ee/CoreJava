package com.tech.collection;

import java.util.*;
class EnumThread extends Thread
{
	private Enumeration en;
	public EnumThread(Enumeration e)
	{
		en=e;
	}
	public void run()
	{
		System.out.println("New Thread started, traversing vector elements. ------------------");
		while(en.hasMoreElements())
			try
			{
				System.out.println(en.nextElement());
				Thread.sleep(2000);
			}
			catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println("New Thread completed.");
	}
}