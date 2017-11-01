/*
 SumLast3

Given a number as input, return the sum of its last 3 digits.
 */
package com.module1b.basic2;

import java.util.Scanner;


public class SumLast3 
{
    public static void main(String[] args)
    {
       SumLast3 obj=new SumLast3();
       Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int n=input.nextInt();
        int result=obj.sumOfLast3Digits(n);
        System.out.println("Sum of Last 3 digits is = "+result);
    }
    public int sumOfLast3Digits(int num)
    {
        int sum=0;
        sum=num%10+(num%100)/10+(num%1000)/100;
        return sum;
    }
    
}
