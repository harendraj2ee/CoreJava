/*
 MultipleCheck

Given a number n as input, return true if n is divisible by at least three and not divisible by at least one of 2,3,5,7 and 11.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class MultipleCheck 
{
    public static void main(String[] args) 
    {
        MultipleCheck obj=new MultipleCheck();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number = ");
        int a=input.nextInt();
        boolean result=obj.isMultipleCheck(a);
        System.out.println("Result is = "+result);
        
        
    }
    public boolean isMultipleCheck(int num)
            
    {
        if(num%2==0 && num%3==0 && num%5==0 && num%7==0 && num%11==0)
      return false;
    else if((num%2==0 && num%3==0 && num%5==0) || (num%2==0 && num%3==0 && num%7==0) || (num%3==0 && num%7==0 && num%11==0))
        return true;
    else if((num%2==0 && num%3==0 && num%11==0) || (num%5==0 && num%7==0 && num%11==0) || (num%2==0 && num%5==0 && num%11==0))
        return true;
    else if((num%2==0 && num%5==0 && num%7==0)||(num%3==0 && num%5==0 && num%7==0) ||(num%2==0 && num%7==0 && num%11==0))
        return true;
    
    else if(num%2!=0 || num%3!=0 || num%5!=0 || num%7!=0 ||num%11!=0)
    return false;
     else
    return false;

        
    }
    
}
