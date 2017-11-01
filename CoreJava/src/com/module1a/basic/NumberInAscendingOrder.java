/*
 NumberInAscendingOrder

Given 3 numbers - num1, num2 and num3 as input, return true if they are in ascending order. 
* Important - Do not use if statement in solution.
 */
package com.module1a.basic;

import java.util.Scanner;


public class NumberInAscendingOrder 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        NumberInAscendingOrder obj=new NumberInAscendingOrder();
        System.out.println("Enter a first number is = ");
        int a=input.nextInt();
        System.out.println("Enter a second number is = ");
        int b=input.nextInt();
        System.out.println("Enter a  thirth number is = ");
        int c=input.nextInt();
        
        boolean bool=obj.numInAscendingOrder(a, b, c);
        
        System.out.println("Number order is = "+bool);
        
    }
    public boolean numInAscendingOrder(int num1, int num2, int num3)
    {
        if(num1<num2 && num2<num3 && num3>num1 )
            return true;
        else
            return false;
    }
    
}
