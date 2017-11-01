/*
Special20Number

A number is special20 if it is a multiple of 20 or if it is one more than a multiple of 20.
Write a function that return true if the given non-negative number is special20.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class Special20Number
{
    public static void main(String[] args)
    {
        Special20Number obj=new Special20Number();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        boolean result=obj.special20(a);
        System.out.println("Result is = "+result);
        
    }
    public boolean special20(int num)
    {
        if(num%20==0 || num%20==1)
            return true;
        else
            return false;
    }
    
}
