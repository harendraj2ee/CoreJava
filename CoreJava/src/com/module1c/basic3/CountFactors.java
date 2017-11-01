/*
CountFactors

Given a number n as input, find the count of its factors other than 1 and n.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class CountFactors 
{
    public static void main(String[] args) 
    {
        CountFactors obj=new CountFactors();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.countOfFactors(a);
        System.out.println("Count the number of factor is = "+result);
        
        
    }
    public int countOfFactors(int n)
    {
        int count=0;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
                count++;
        }
        return count;
    }
    
}

