/*
 AndBooleans
Given three booleans as input, return the and of the all three booleans
 */
package com.module1a.basic;

public class AndBooleans {
    public static void main(String[] args) {
        AndBooleans obj=new AndBooleans();
        boolean result=obj.andBooleans(true, true, true);
        System.out.println("Boolean is = " +result);
        
        boolean result1=obj.andBooleans(true, true, false);
        System.out.println("Boolean is = " +result1);
        
        boolean result2=obj.andBooleans(true, false, false);
        System.out.println("Boolean is = " +result2);
        
        boolean result3=obj.andBooleans(false, true, true);
        System.out.println("Boolean is = " +result3);
        
        boolean result4=obj.andBooleans(false, false, false);
        System.out.println("Boolean is = " +result4);




    }
    public boolean andBooleans(boolean bool1, boolean bool2, boolean bool3)
    {
        if(bool1  && bool2 && bool3) 
                return true;
        else 
            return false;
    }
}
