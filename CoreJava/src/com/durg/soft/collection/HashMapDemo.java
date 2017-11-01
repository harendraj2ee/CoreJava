package com.durg.soft.collection;
import java.util.*;
public class HashMapDemo {
	public static void main(String args[]){
		HashMap m=new HashMap();
		m.put("Chiran Jeevi", 700);
		m.put("Balaiah", 800);
		m.put("Venkatesh", 200);
		m.put("Nagaarjuna", 500);
		System.out.println("m ::: "+m);
		System.out.println(m.put("Chiran Jeevi", 1000));
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println("c ::: " +c);
		Set s1=m.entrySet();
		System.out.println("s1 ::: "+s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+ " -------- " +m1.getValue());
			if(m1.getKey().equals("Nagaarjuna")){
				m1.setValue(10000);
			}
		}
		System.out.println(m);
	}

}
