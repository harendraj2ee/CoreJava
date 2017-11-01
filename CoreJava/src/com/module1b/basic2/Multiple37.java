/*
 Multiple37

Given a number n, return true if it is divisible by either 3 or 7.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class Multiple37 
{
    public static void main(String[] args)
    {
        Multiple37 obj=new Multiple37();
        
        System.out.println("Enter a 1st number is = ");
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
         boolean result1=obj.multiple37(num1);
         System.out.println("1st Boolean result is = "+result1);
         
         System.out.println("Enter a 2nd number is = ");
         int num2=input.nextInt();
         boolean result2=obj.multiple37(num2);
         System.out.println("2nd Boolean result is = "+result2);
        
    }
    public boolean multiple37(int n)
    {
        if(n%3==0 || n%7==0)
            return true;
        else
            return false;
    }
    
}
