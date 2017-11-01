/*
 MiddleChar

Given three chars as input, return the char that would come in the middle if the chars were arranged in order.
Note that > operator can be used for chars.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class MiddleChar
{
    public static void main(String[] args) 
    {
        MiddleChar obj=new MiddleChar();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st Element is = ");
                
        char a=input.next().charAt(0);
        System.out.print("Enter 2nd Element is = ");
        char b=input.next().charAt(0);
        System.out.print("Enter 3rd Element is = ");
        char c=input.next().charAt(0);
        char result=obj.middle(a, b, c);
        System.out.println("Result of Middle element is = "+result);
        
    }
    public char middle(char ch1, char ch2, char ch3)
    {
        if((ch1>=ch2 && ch1<=ch3) ||(ch1>=ch3 && ch1<=ch2))
            return ch1;
        else if((ch2>=ch3 && ch2<=ch1) || (ch2>=ch1 && ch2<=ch3))
            return ch2;
        else
            return ch3;
    }
    
}
