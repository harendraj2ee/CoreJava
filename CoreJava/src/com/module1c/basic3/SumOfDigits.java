/*
 SumOfDigits

Given a number n, find the sum of its digits.
 */
package com.module1c.basic3;

import java.util.Scanner;


public class SumOfDigits 
{
    public static void main(String[] args)
    {
        SumOfDigits obj = new SumOfDigits();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result = obj.sumDigits(a);
        System.out.println("Sum of digit is = "+result);
        
    }
    public int sumDigits(int num)
    {
        int sumDig=0;
        while(num>0)
        {
            int rem=num%10;
            sumDig=sumDig+rem;
            num=num/10;
        }
        return sumDig;
    }
    
}
