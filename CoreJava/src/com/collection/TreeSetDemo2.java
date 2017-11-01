
package com.collection;
import java.util.*;
public class TreeSetDemo2 
{
    public static void main(String[] args) 
    {
        //TreeSet t=new TreeSet();  //[0, 10, 15, 20]
        TreeSet t=new TreeSet(new MyComparator()); //[20,15,10,0]
        t.add(10); 
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        System.out.println(t);
        
    }
    
}
class MyComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        Integer I1=(Integer)obj1;
        Integer I2=(Integer)obj2;
        if(I1<I2)
            return +1;
        else if (I1>I2)
            return -1;
        else
            return 0;
        // return I1.compareTo(I2); //Assecending order [0,10,15,20]
        //return -I1.compareTo(I2); //Descending order  [20,15,10,0]
        
        //return I2.compareTo(I1);  //Descending order  [20,15,10,0]
        //return -I2.compareTo(I1);   //Assecending order  [0,10,15,20]
        
        //return +1;   //  [10, 0, 15, 20, 20] insertion order
        //return -1;     //  [20, 20, 15, 0, 10]  Reverse of insertion order
        //return 0; //[10]  Only first element will be inserted & all other elements are consider as dublicate
        
    }
}
