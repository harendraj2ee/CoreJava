package com.tech.collection;

import java.util.*;
class SetTest
{
	public static void main(String arr[])
	{
		HashSet hs=new HashSet();
		System.out.println("Result of adding India first time to the set is : "+hs.add("India"));
		hs.add("Pakistan");
		hs.add("Bhutan");
		hs.add("Nepal");
		hs.add("China");
		System.out.println("Result  of adding India second time to the set is : "+hs.add("India"));
		System.out.println("There are : "+hs.size()+ " Countries in the Set. -----------------");
		System.out.println("Countries are : ");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		TreeSet ts=new TreeSet();
		System.out.println("Adding all the countries of the HashSet to a TreeSet. -------------------");
		ts.addAll(hs);
		System.out.println("Countries in ascending order of their name are : ");
		itr=ts.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Removing China from the Set. -----------------------------");
		ts.remove("China");
		System.out.println("No. of element after remove as : "+ts.size());
		System.out.println("Searching  Nepal in the Set. -----------------------------");
		if(ts.contains("Nepal"))
			System.out.println("Found.");
		else
			System.out.println("No Found.");
	}
}