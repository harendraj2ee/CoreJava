
package com.collection;

import java.util.*;
public class VectorDemo3 
{
    public static void main(String[] args)
    {
        Vector v=new Vector(10,5);
        System.out.println(v.capacity()); //10
        for(int i=1; i<=10; i++)
        {
            v.addElement(i);
        }
        System.out.println(v.capacity());//10
        v.addElement("A");
        System.out.println(v.capacity());//15
        System.out.println(v);
        
    }
    
}
