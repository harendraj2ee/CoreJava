package com.tech.collection;

import java.util.*;
class ListTest
{
	public static void main(String arr[])
	{
		ArrayList list=new ArrayList();
		list.add("India");
		list.add("Pakistan");
		list.add("Bhutan");
		list.add(1,"Nepal");
		list.add(2,"China");
		System.out.println("There are "+list.size()+" Countries in the list. ----------- ");
		System.out.println("Countries are in the other of insertion.");
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Countreis in the reverse of insertion : ");
		ListIterator litr=list.listIterator(list.size());
		while(litr.hasPrevious())
			System.out.println(litr.previous());
			System.out.println("Removing China from the set. -------------");
		list.remove(2);
		System.out.println("No. of element after removal : "+list.size());
		System.out.println("Searching Nepal in the set. -------------------------- ");
		if(list.contains("Nepal"))
			System.out.println("Found.");
		else
			System.out.println("Not Found.");
	}
}