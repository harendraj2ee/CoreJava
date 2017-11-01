/*
 SumNumbers

Given a number n as input, output the sum of numbers from 1 to n.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class SumNumbers 
{
    public static void main(String[] args) 
    {
        SumNumbers obj=new SumNumbers();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a nubmer is = ");
        int a=input.nextInt();
        int result=obj.sumOfNumbers(a);
        System.out.println("Sum of number is = "+result);
    }
    public int sumOfNumbers(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    
}
