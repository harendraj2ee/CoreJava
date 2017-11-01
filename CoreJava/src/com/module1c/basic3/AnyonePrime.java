/*
AnyonePrime

Given three numbers as input, return true if at least one of them is a prime number. 
* 
For solving this problem, define a function that checks whether a number is a prime or not and use that function.
 */
package com.module1c.basic3;

import java.util.Scanner;


public class AnyonePrime 
{
    public static void main(String[] args)
    {
        AnyonePrime obj=new AnyonePrime();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a1=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int a2=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int a3=input.nextInt();
        
        boolean result=obj.anyOnePrimeNo(a1, a2, a3);
        System.out.println("Number is Prime or no = "+result);
        
    }
    public boolean anyOnePrimeNo(int num1, int num2, int num3)
    {
        boolean a=isPrimeNo(num1);
        boolean b=isPrimeNo(num2);
        boolean c=isPrimeNo(num3);
        if(a|b|c==true)
            return true;
        else
            return false;
    }
    public boolean isPrimeNo(int num)
    {
        if(num>1)
        {
            for(int i=2; i<=num/2; i++)
            {
                if(num%i==0)
                    return false;
            }
            return true;
        }
        
        return false;
    }
    
}
