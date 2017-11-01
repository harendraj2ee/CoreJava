/*
 SumNumbers1

Given a number n as input, find the sum of all numbers from 1 to n which are not divisible by either 2 or 3.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class SumNumbers1
{
    public static void main(String[] args) 
    {
        SumNumbers1 obj=new SumNumbers1();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.isSum(a);
        System.out.println("Add of number is = "+result);
        
    }
    public int isSum(int n)
    {
        int sum=0;
        for(int i=0; i<=n; i++)
        {
            if(i%2!=0 && i%3!=0)
              sum=sum+i;
        }
        return sum;
    }
    
}
