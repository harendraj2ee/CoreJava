package com.collection.jPont;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListCollec {
	public static void main(String args[]){
		System.out.println("1st ArrayList ::::::::::::::::::::::");
		ArrayList<String> list=new ArrayList<String>();   //Creating arraylist  
		list.add("Harendra"); //Adding object in arraylist  
		list.add("Upendra");
		list.add("Ashutosh");
		list.add("Vivek");
		list.add("Ranjan");
		list.add(5, "Rashmi");
		list.add(6, "Prabhu Deva");
		System.out.println(list);
		Iterator<String> itr=list.iterator();  ////Traversing list through Iterator  
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("2nd ArrayList ::::::::::::::::::");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Prabhat");
		list2.add("Pramod");
		list2.add("Amit");
		list2.add("Viru");
		list2.add("Ravindra");
		list2.add("Balu");
		list2.add("Vikas");
		System.out.println(list2);
		for(String obj:list2){
			System.out.println(obj);
		}
		
		System.out.println("3rd ArrayList ::::::::::::::::::::::::::::::::::::::::::::");
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("Suraj Gupta");
		list3.add("Nitish");
		list3.add("Sandeep");
		list3.add("Ajay");
		System.out.println(list3);
		list3.remove(2);
		list3.addAll(list2);    //addAll(Collection c) 
		System.out.println("After Remove list :::: "+list3);
		Iterator itr3=list3.iterator();
		while(itr3.hasNext()){
			System.out.println(itr3.next());
		}
	}
	
	
	
	

}
