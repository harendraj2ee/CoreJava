
package com.collection;

import java.util.*;
public class TreeSetCompareToDemo
{
    public static void main(String[] args)
    {
       TreeSet t=new TreeSet();
        t.add("B");     
        t.add("Z");     //"Z".compareTo("B"); +ive
        t.add("A");     //"A".compareTo("B"); -ive
        System.out.println(t);  //[A,B,Z]
        
    }
    
}
