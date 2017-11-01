/*
 ReverseNumber

Given a number as input, reverse it. You can assume that the number is not negative.
 */
package com.module1c.basic3;

import java.util.Scanner;


public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        ReverseNumber obj=new ReverseNumber();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.reverse(a);
        System.out.println("Reverse number is = "+result);
        
    }
    
    public int reverse(int num){
		
		int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
		
	}
    
}
