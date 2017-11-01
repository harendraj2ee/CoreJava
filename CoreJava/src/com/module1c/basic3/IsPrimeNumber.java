/*
 IsPrimeNumber

Given a number n as input, return whether the number is a prime number or not. Please note that 1 is not a prime number.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class IsPrimeNumber 
{
    public static void main(String[] args)
    {
        IsPrimeNumber obj =new IsPrimeNumber();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        boolean result=obj.isPrime(a);
        System.out.println("Number is prime = "+result);
    }
    public boolean isPrime(int num)
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
