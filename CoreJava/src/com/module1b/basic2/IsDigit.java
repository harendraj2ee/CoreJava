/*
 IsDigit
Given a char as input, return true if it is a digit (i.e. between 0 to 9).
 */
package com.module1b.basic2;

import java.util.Scanner;

public class IsDigit 
{
    public static void main(String[] args) 
    {
        IsDigit obj=new IsDigit();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Element is = ");
        char ch1=input.next().charAt(0);
        boolean result=obj.isDigit(ch1);
        System.out.println("Result is = "+result);
        
    }
    public boolean isDigit(char ch)
    {
        if(ch>='0' && ch<='9')
            return true;
        else 
            return false;
    }
    
}
