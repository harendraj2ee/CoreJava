/*
 ConsecutiveCentury

Given the scores of a batsman in four innings, return whether he scored at least two centuries or not.
 */
package com.module1b.basic2;

import java.util.Scanner;


public class ConsecutiveCentury 
{
    public static void main(String[] args)
    {
       ConsecutiveCentury obj=new ConsecutiveCentury();
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a 1st number is = ");
       int a=input.nextInt();
       System.out.print("Enter a 2nd number is = ");
       int b=input.nextInt();
       System.out.print("Enter a 3rd number is = ");
       int c=input.nextInt();
       System.out.print("Enter a 4th number is = ");
       int d=input.nextInt();
       boolean result=obj.isConsecutiveCentury(a, b, c, d);
        System.out.println("Result is = " +result);    
        
    }
    public boolean isConsecutiveCentury(int score1, int score2, int score3, int score4 )
    {
        if((score1>=100 && score2>=100) || (score3>=100 && score4>=100) ||(score3>=100 && score1>=100) || (score2>=100 && score4>=100))
		return true;
		else 
		return false;

    }
    
}
