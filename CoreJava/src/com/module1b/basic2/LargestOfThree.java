/*
 LargestOfThree

Given three numbers as input, return the largest number.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class LargestOfThree 
{
    public static void main(String[] args) 
    {
      LargestOfThree obj=new LargestOfThree();
      Scanner input=new Scanner(System.in);
        System.out.println("Enter three numbers is = ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int result=obj.largestOfThree(num1, num2, num3);
        System.out.println("Largest number is = "+result);
    }
    public int largestOfThree(int a,int b, int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>c && b>a)
            return b;
        else
            return c;
        
    }
    
}
