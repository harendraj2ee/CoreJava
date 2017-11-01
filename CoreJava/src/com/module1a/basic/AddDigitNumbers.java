/*
 AddDigitNumbers
Problem Statement

Given three digits as input, create a 4 digit number out of each input in which all the digits are the same. 
Then add all the 3 numbers and return the value.
 */
package com.module1a.basic;

import java.util.Scanner;

public class AddDigitNumbers 
{
    public static void main(String[] args) 
    {
        AddDigitNumbers obj=new AddDigitNumbers();
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 1st number is = ");
        int a=input.nextInt();
        System.out.println("Enter a 1st number is = ");
        int b=input.nextInt();
        System.out.println("Enter a 1st number is = ");
        int c=input.nextInt();
        int result=obj.add3To4(a, b, c);
        System.out.println("sum of digit is = " +result);
        
        
    }
    public int add3To4(int digit1,int digit2,int digit3)
    {
        int sum1,sum2,sum3;
        int totalSum=0;
        sum1=digit1*1000+digit1*100+digit1*10+digit1;
        sum2=digit2*1000+digit2*100+digit2*10+digit2;
        sum3=digit3*1000+digit3*100+digit3*10+digit3;
        totalSum=sum1+sum2+sum3;
        return totalSum;
        
    }
    
}
