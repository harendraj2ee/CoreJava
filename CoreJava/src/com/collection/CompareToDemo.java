
package com.collection;


public class CompareToDemo 
{
    public static void main(String[] args)
    {
        System.out.println("A".compareTo("Z"));     // -ive
        System.out.println("Z".compareTo("B"));     // +ive
        System.out.println("A".compareTo("A"));     // 0(zero)
        //System.out.println("A".compareTo(null));  // NullPointerException
    }
    
}
