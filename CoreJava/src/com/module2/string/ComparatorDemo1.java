/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module2.string;

import java.util.*;
/**
 *
 * @author Home
 */
public class ComparatorDemo1 {
    public static void main(String[] args) {
        
        TreeSet t= new TreeSet(new MyComparator());
        t.add("Ram");
        t.add("Shyama");
        t.add("Upendra");
        t.add("Ghanshyam");
        t.add("Arun");
        t.add("arun");
        System.out.println(t);
    }
    
}

class MyComparator implements Comparator
{
    public int compare(Object ob1, Object ob2)
    {
        String s1=ob1.toString();
        String s2=ob2.toString();
        return s1.compareTo(s2);//natural order(default order)(asending)
        //return -s1.compareTo(s2);// customise order(desending order)
    }
}