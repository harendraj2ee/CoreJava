/*
 ScoredCentury

The scores of a batsman in his last three innings have been provided. You have to determine whether he has 
scored a century in the last three innings or not. If yes, return true else return false.
 */
package com.module1b.basic2;

import java.util.Scanner;


public class ScoredCentury
{
    public static void main(String[] args) 
    {
        ScoredCentury obj=new ScoredCentury();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st innings run = ");
        int inn1=input.nextInt();
        System.out.print("Enter a 1st innings run = ");
        int inn2=input.nextInt();
        System.out.print("Enter a 1st innings run = ");
        int inn3=input.nextInt();
        boolean result=obj.hasScored(inn1, inn2, inn3);
        System.out.println("Boolean result is = "+result);
        
        
    }
    public boolean hasScored(int score1, int score2, int score3)
    {
        if(score1>=100 || score2>=100 || score3>=100)
            return true;
        else
            return false;
        
    }
    
}
