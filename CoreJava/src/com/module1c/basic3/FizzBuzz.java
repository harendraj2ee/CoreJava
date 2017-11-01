/*
 FizzBuzz

A number is considered fizz if it is divisible by 3. It is considered buzz if it is divisible by 5. 
It is considered fizzbuzz if it is divisible by both 3 and 5. A fizzbuzz is neither fizz nor buzz. 
Given two numbers n1 and n2 such that n2>n1, let f be the number of fizz, b be the number of buzz and 
fb be the number of fizzbuzz between n1 and n2(both n1 and n2 are included). Calculate and return the value of 3*f+5*b-15*fb.
 */
package com.module1c.basic3;

import java.util.Scanner;


public class FizzBuzz 
{
    public static void main(String[] args) 
    {
        FizzBuzz obj = new FizzBuzz();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int b=input.nextInt();
        int result=obj.isFizzBuzz(a, b);
        System.out.println("Result is = "+result);
        
        
    }
    public int isFizzBuzz(int num1, int num2)
    {
        int fb=0,f=0,b=0;
        for(int i=num1; i<=num2; i++)
        {
            if(i%3==0 && i%5==0)
                fb=fb+1;
            else if(i%3==0)
                f=f+1;
            else if(i%5==0)
                b=b+1;
        }
        return 3*f+5*b-15*fb;
    }
    
}
