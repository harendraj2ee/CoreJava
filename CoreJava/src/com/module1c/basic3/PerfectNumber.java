/*
 PerfectNumber

A perfect number is a positive integer that is equal to the sum of its factors. 
For example, 6 is a perfect number because 6=1+2+3; but 24 is not perfect because 24<1+2+3+4+6+8+12.
Given a number n, the objective is find out whether it is a perfect number or not.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args) 
    {
        PerfectNumber obj = new PerfectNumber();
        Scanner inpput = new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=inpput.nextInt();
        boolean result=obj.isPerfect(a);
        System.out.println("Perfect number is true or false  = "+result);
        
        
    }
    public boolean isPerfect(int num)
    {
        int sum=0;
		for(int i=1; i<num; i++)
		{
		    if(num%i==0)
		    sum=i+sum;
		        
		}
                
                if(sum==num)
		    return true;
                else
		return false;
    }
    
}
