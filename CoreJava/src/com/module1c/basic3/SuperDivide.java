/*
 SuperDivide

A positive int is called super-divide if every digit in the number divides the number. 
So for example 128 divides itself since 128 is divisible by 1, 2, and 8. Note that no number 
is divisible by 0. Given a number as input, determine if it is a super-divide.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class SuperDivide
{
    public static void main(String[] args)
    {
        SuperDivide obj =new SuperDivide();
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        boolean result=obj.checkSuper(a);
        System.out.println("Number divide the given digit own by it self = "+result);
        
    }
    
    public boolean checkSuper(int num)
    {
        if(num%10==0)
		return false;
		else if(num%10!=0)
		{
		    int temp=num;
		    while(temp>0)
		    {
		       int rem=temp%10;
		        if(num%rem!=0)
		        return false;
		        temp=temp/10;
		    }
		    
		}
		return true;

    }
    
}
