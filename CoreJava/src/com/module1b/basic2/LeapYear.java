/*
 LeapYear

Given a year, return true if it is a leap year otherwise return false. Please note that years that are
multiples of 100 are not leap years, unless they are also multiples of 400.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args) 
    {
        LeapYear obj=new LeapYear();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a year in number = ");
        int a=input.nextInt();
        boolean result=obj.isLeapYear(a);
        System.out.println("Result is = "+result);
        
        
    }
    public boolean isLeapYear(int year)
    {
        if((year%400==0 || year%100!=0) && (year%4==0))
            return true;
        else
            return false;
    
    }
           
    
}
