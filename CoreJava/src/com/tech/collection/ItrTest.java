package com.tech.collection;
import java.util.*;
class ItrTest
{
	public static void main(String arr[])
	{
		System.out.println("Main Thread is statred,, creating a list. --------");
		ArrayList list=new ArrayList();
		list.add("One");
		list.add("two");
		list.add("Three");
		Iterator itr=list.iterator();
		System.out.println("List created, Iterator obtained, starting a new thread. --------");
		ItrThread th=new ItrThread(itr);
		th.start();
		System.out.println("New Thread created, Suspending main thread. ------------");
		try
		{
			Thread.sleep(1000);
			
		}
		catch(Exception ex)	{ }
		System.out.println("Main Thread resumed, modifying vector. ------------");
		list.add("Four");
		list.add("Five");
		System.out.println("List Modified, main Thread completed.");
	}
}