/*
 SumOfDigitsWithCount

Given 2 inputs, a number n and the number of digits it has d , find the sum of its digits.
 */
package com.module1c.basic3;

import java.util.Scanner;


public class SumOfDigitsWithCount
{
    public static void main(String[] args)
    {
        SumOfDigitsWithCount obj=new SumOfDigitsWithCount();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int num=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
       int count=input.nextInt();
        int result=obj.sumDigits(num, count);
        System.out.println("Sum of digit is & also count digit is = "+result+", "+count);
        
        
    }
    public int sumDigits(int num, int count)
    {
        int sum=0;
        for(int i=1; i<=count; i++)
        {
            int b=num%10;
            sum=sum+b;
            num=num/10;
        }
        return sum;
    }
    
}
