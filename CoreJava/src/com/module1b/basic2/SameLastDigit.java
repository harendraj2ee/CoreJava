/*
 SameLastDigit

Given 2 non negative numbers a and b, return true if both of them have the same last digit.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class SameLastDigit 
{
    public static void main(String[] args)
    {
        SameLastDigit obj=new SameLastDigit();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st number is = " );
        int x=input.nextInt();
        System.out.print("Enter 2nd number is = ");
        int y=input.nextInt();
        boolean result=obj.isSameLarstDigit(x, y);
        System.out.println("Result is a%b = " +result);
        
    }
    public boolean isSameLarstDigit(int a, int b)
    {
        int num1=a%10;
        int num2=b%10;
        if(num1==num2)
            return true;
        else 
            return false;
    }
    
}
