/*
 Make3Digit

Given a digit as input, create a 3 digit number in which all the digits are the same as the input digit.
 */
package com.module1a.basic;

import java.util.Scanner;


public class Make3Digit 
{
    public static void main(String[] args) 
    { 
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter a number is = ");
       int num1=obj.nextInt();
        
        int digit=num1*100+num1*10+num1*1;
        System.out.println("Three digit number is = "+digit);
        
    }
    
}
