/*
CountTheDigit

Given a number n and a digit d as input, find the number of time d occurs in n. You can assume that the number is non-negative.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class CountTheDigit
{
    public static void main(String[] args) 
    {
        CountTheDigit obj=new CountTheDigit();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number is = ");
        int a=input.nextInt();
        System.out.print("Enter a digit: ");
        int b=input.nextInt();
        int result=obj.findDigitCount(a, b);
        System.out.println("Number of Digit Occur in the number = "+result);
        
    }
    public int findDigitCount(int num, int digit)
    {
        int temp=0,count=0;
        while(num>0)
        {
            temp=num%10;
            if(temp==digit)
                count++;
            num=num/10;
        }
        return count;
        
    }
    
}
