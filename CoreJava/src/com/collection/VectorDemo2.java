
package com.collection;
import java.util.*;
public class VectorDemo2
{
    public static void main(String[] args) 
    {
        
        Vector v=new Vector(35);
        System.out.println(v.capacity());
        for(int i=1; i<=10; i++)
        {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);
    }
    
}
