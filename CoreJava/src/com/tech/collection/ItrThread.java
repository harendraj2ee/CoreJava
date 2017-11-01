package com.tech.collection;

import java.util.*;
class ItrThread extends Thread
{
	private Iterator itr;
	public ItrThread(Iterator itr)
	{
		this.itr=itr;
	}
	public void run()
	{
		System.out.println("New Thread started, traversing list element. ----------------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		System.out.println("New Thread Completed.");
	}
}