/*
ComputeNthPrime

Given an input n, find out the nth prime
 */
package com.module1c.basic3;

import java.util.Scanner;

public class ComputeNthPrime 
{
    public static void main(String[] args)
    {
      ComputeNthPrime obj=new ComputeNthPrime();
      Scanner input=new Scanner(System.in);
        System.out.print("Enter number is = ");
        int a=input.nextInt();
        int result=obj.computePrime(a);
        System.out.println("Whose prime number count given number  = "+result);
        
    }
    public int computePrime(int n)
    {
        int currentNum=1;
		int count=0;
        while(count!=n)
        {
        currentNum++;
        if(isPrime(currentNum))
        count++;
        } 
        return currentNum; 

    }
    
    public boolean isPrime (int num)
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
