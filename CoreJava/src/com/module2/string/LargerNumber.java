/*
 LargerNumber

Given 2 strings representing numbers as input, return the larger number. Note that both the numbers are non negative.
 */
package com.module2.string;

import java.util.Scanner;

public class LargerNumber 
{
    public static void main(String[] args) 
    {
        LargerNumber obj=new LargerNumber();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        String str1=input.nextLine();
        System.out.print("Enter 2nd number : ");
        String str2=input.nextLine();
        String result=obj.larger(str1, str2);
        System.out.println("Larger number is : "+result);
    }
    public String larger(String num1, String num2)
    {
        Long n1=Long.parseLong(num1);
        Long n2=Long.parseLong(num2);
        String s1=Long.toString(n1);
        String s2=Long.toString(n2);
        if(n1>n2)
        return s1;
        else
            return s2;
    }
    
}
