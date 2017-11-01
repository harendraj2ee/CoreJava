/*
 FirstDigit

Given a number as input, find the most significant digit in it. You can assume that the number is not negative.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class FirstDigit
{
    public static void main(String[] args) 
    {
        FirstDigit obj=new FirstDigit();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.firstDigit(a);
        System.out.println("First Digit is = "+result);
        
    }
    public int firstDigit(int num)
    {
        int rem=0;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
        }
        return rem;
    }
    
}
