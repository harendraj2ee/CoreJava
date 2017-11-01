/*
 Count3Den

A number is defined as a 3Den if it is a multiple of 3 or has the digit 3 in it. 
Given a number num as input, count the number of 3Den between 1 and num.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class Count3Den
{
    public static void main(String[] args)
    {
        Count3Den obj=new Count3Den();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number is = ");
        int b=input.nextInt();
        int result=obj.count(b);
        System.out.println("Divied by 3 given a number is = "+result);
    }
    public int count(int num){
		
		int count=0;
		for(int i=1; i<=num; i++)
		{
		    if(i%3==0 || check3Den(i))
		    count++;
		}
		
		return count;
	}
	public boolean check3Den(int x)
	{
	    while(x>0)
	    {
	        int a=x%10;
	        if(a==3)
	        return true;
	        x=x/10;
	    }
	    return false;
        }
    
}
