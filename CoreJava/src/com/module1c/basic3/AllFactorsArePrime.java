/*
 AllFactorsArePrime

Given a number n, return true is all the factors of n are prime numbers. 
Note that 1 and the number itself are not considered as factors in this problem.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class AllFactorsArePrime 
{
    public static void main(String[] args)
    {
        AllFactorsArePrime obj=new AllFactorsArePrime();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int num=input.nextInt();
        boolean result=obj.areAllFactorsPrime(num);
        System.out.println("Multiple of factor is given number prime or not = "+result);
    }
    public boolean areAllFactorsPrime(int n) {
		
		 for(int i=2; i<=n/2; i++)
        {
            int a=0;
            if(n%i==0)
            {a=i;}
            if(!isPrime(a))
            return false;
        }
        return true;
	}
	public boolean isPrime(int x)
	{
	    if(x==2)
	    return true;
	    for(int i=3; i<=x/2; i++)
	    {
	        if(x%i==0)
	        return false;
	    }
	    return true;
	

	}
}
