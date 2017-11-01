package com.tech.collection;

import java.util.*;
class MapTest1
{
	public static void main(String arr[])
	{
		//HashMap map=new HashMap();	//Random Order
		TreeMap map=new TreeMap();  //Ascending Order
		map.put("India","New Delhi");
		map.put("Pakistan","Islamabad");
		map.put("Bhutan","Thimpu");
		map.put("Nepal","Kathmandu");
		map.put("Afganistan","Kabul");
		Scanner in=new Scanner(System.in);
		while(true)  //infinite loop
		{
			
			System.out.println("Entry Country name to find capital end to terminate.");
			String key=in.nextLine();
			if(key.equalsIgnoreCase("end"))
				break;
			String cap=(String)map.get(key);
			if(cap==null)
				System.out.println("The Country is not in our map.");
			else
				System.out.println("Capital is : "+cap);
		}
		
		System.out.println("Our map has following entries : ");
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"\t"+m.getValue());
			
	  }
	}
}