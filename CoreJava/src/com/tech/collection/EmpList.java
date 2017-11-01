package com.tech.collection;

import java.util.*;
class EmpList
{
	public static void main(String arr[])
	{
		ArrayList list=new ArrayList();
		list.add(new Emp("Raman","Trainee",5000));
		list.add(new Emp("Kamal","Trainer",55000));
		list.add(new Emp("Vipul","Manager",75000));
		list.add(new Emp("Aditya","Accountant",15000));
		System.out.println("There are "+list.size()+" Emp in the list. -------");
		System.out.println("Contents of the list are : ");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Emp e=(Emp)itr.next();
			e.display();
			
		}
		System.out.println("Removing following Emp from the list. -------------");
		Emp e1=new Emp("Vipul","Manager",75000);
		e1.display();
		list.remove(e1);
		System.out.println("No. of elements after removal : "+list.size());
		System.out.println("Searching following Emp in the list. ----------");
		Emp e2=new Emp("Kamal","Trainer",55000);
		e2.display();
		if(list.contains(e2))
			System.out.println("Found.");
		else
			System.out.println("Not Found.");
	}
}