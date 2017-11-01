package com.tech.collection;

import java.util.*;
class EmpTS
{
	public static void main(String arr[])
	{
		//Comparable logic will be used for sorting Emp2 Objects.
		TreeSet set=new TreeSet();
		set.add(new Emp2("Sumit","Trainee",500000));
		set.add(new Emp2("Kamal","Trainer",55000));
		set.add(new Emp2("Vipul","Manager",75000));
		set.add(new Emp2("Amit","Accountant",15000));
		
        TreeSet s0=new TreeSet(new NameComparator());
		s0.addAll(set);
                System.out.println("Employes in ascending order of name. ");
		display(s0.iterator());
		//JobComparator will be used for sorting Emp Objects
		TreeSet s1=new TreeSet(new JobComparator());
		s1.addAll(set);
		System.out.println("Employees in ascending order of job : ");
		display(s1.iterator());
		
		// SalaryComparator will be used for sorting Emp Objects 
		TreeSet  s2=new TreeSet(new SalaryComparator());
		s2.addAll(set);
		System.out.println("Employees inn ascending order of salary.");
		display(s2.iterator());
	}
	private static void display(Iterator itr)
	{
		while(itr.hasNext())
		{
			Emp2 e=(Emp2)itr.next();
			e.display();
		}
	}
}