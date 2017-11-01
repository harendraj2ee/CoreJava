/*
 SumOfSquares

Given two numbers n1 and n2 such that n2>n1, find sum of squares of all numbers from n1 to n2 (including n1 and n2).
 */
package com.module1c.basic3;

import java.util.Scanner;


public class SumOfSquares 
{
    public static void main(String[] args)
    {
        SumOfSquares obj=new SumOfSquares();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st Number is = ");
        int a=input.nextInt();
        System.out.print("Enter a 2nd Number is = ");
        int b=input.nextInt();
        int result=obj.computeSumOfSquares(a, b);
        System.out.println("Sum of total number is = "+result);
    }
    public int computeSumOfSquares(int n1, int n2)
    {
        int sum=0;
        if(n2>=n1)
        for(n1=n1; n1<=n2; n1++)
        {
            sum=sum+n1*n1;
        }
        return sum;
    }
    
}
