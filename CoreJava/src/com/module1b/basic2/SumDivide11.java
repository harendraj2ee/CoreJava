/*
 SumDivide11

You have been given 4 numbers as input. Return true if you can find 3 numbers among them whose sum is divisible by 11. 
In this problem, define a function that takes 3 numbers as input and returns true if there sum is divisible by 11. 
Use this function to check for the 4 numbers.
 */
package com.module1b.basic2;

import java.util.Scanner;


public class SumDivide11 
{
    public static void main(String[] args)
    {
        SumDivide11 obj=new SumDivide11();
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a 1st number is = ");
        int a1=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int a2=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int a3=input.nextInt();
        System.out.print("Enter a 4th number is = ");
        int a4=input.nextInt();
        
        boolean result=obj.sumDivBy11(a1, a2, a3, a4);
        System.out.println("Result is = "+result);
        
        
    }
    public boolean sumDivBy11(int num1, int num2, int num3, int num4)
    {
        boolean a=checkSumDivBy11(num1, num2, num3);
        boolean b=checkSumDivBy11(num2, num3, num4);
        boolean c=checkSumDivBy11(num3, num4, num1);
        boolean d=checkSumDivBy11(num4, num1, num2);
        if(a|b|c|d==true)
            return true;
        else
            return false;
        
    }
    public boolean checkSumDivBy11(int x, int y, int z)
    {
        int sum=x+y+z;
        if(sum%11==0)
            return true;
        else
            return false;
    }
    
}
