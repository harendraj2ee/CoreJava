/*
 LargestDigit

Given a number as input, find the largest digit in it. You can assume that the number is not negative.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class LargestDigit 
{
    public static void main(String[] args) 
    {
        LargestDigit obj=new LargestDigit();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.maxDigit(a);
        System.out.println("Maximum digit is = "+result);
        
    }
    public int maxDigit(int num)
    {
        int max=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem>max)
                max=rem;
            num=num/10;
        }
        return max;
    }
    
}
