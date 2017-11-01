package com.tech.collection;

import java.util.*;
class VectorTest
{
	public static void main(String arr[])
	{
		System.out.println("Main thread started, creating a vector. ------------");
		Vector v=new Vector();
		v.add("One");
		v.add("Two");
		v.add("Three");
		Enumeration e=v.elements(); //To Traversing
		System.out.println("Vector created enumeration obtained starting a new thread. -----------");
		EnumThread th=new EnumThread(e);
		th.start();
		System.out.println("New Thread Created, Suspendinng main Thread. -------------");
		try
		{
			Thread.sleep(1000);
			
		}
		catch(Exception ex){	}
		
			System.out.println("Main Thread resumed modifiying vector. ----------------");
			v.add("Four");
			v.add("Five");
			System.out.println("vector modified, Main Thread completed.");
		
	}
}