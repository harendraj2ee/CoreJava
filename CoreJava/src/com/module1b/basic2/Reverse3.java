/*
 Reverse3

Given a 3 digit number as input, reverse it.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class Reverse3 
{
    public static void main(String[] args)
    {
        Reverse3 obj=new Reverse3();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.reverseDigit(a);
        System.out.println("Reverse Digits is = "+result);
        
    }
    public int reverseDigit(int num)
    {
        int revNum=0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            revNum=(revNum*10)+rem;
            num=num/10;
        }
        return revNum;
    }
    
}
