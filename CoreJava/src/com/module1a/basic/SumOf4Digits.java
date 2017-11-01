/*
 SumOf4Digits

Given a number as input, compute the sum of its last 4 digits. Assume that the number has at least 4 digits.
 */
package com.module1a.basic;

import java.util.Scanner;


public class SumOf4Digits 
{
    public static void main(String[] args) 
    {
        SumOf4Digits obj =new SumOf4Digits();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number is = ");
        int a=input.nextInt();
        int num=obj.sum4Digit(a);
        System.out.println("Sum of maximum 4 digit Digit is = " +num) ;
    }
    public int sum4Digit(int  n)
    {
        int sum=0;
        sum=((n%10)+(n%100)/10+(n%1000)/100+(n%10000)/1000);
        return sum;
    }
 }
