/*
 ReverseString
 
Given a string as input, reverse it. Reverse means return the string if it is read from right to left.
 */
package com.module2.string;

import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args)
    {
        ReverseString obj=new ReverseString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str2=input.nextLine();
        String result=obj.reverse(str2);
        System.out.println("Reverse String is : "+result);
        
    }
    public String reverse(String str1)
    {
        String revString="";
        int len=str1.length();
        for(int i=0; i<len; i++)
        {
            char eachChar=str1.charAt(i);
            revString= eachChar + revString;
        }
        return revString;
    }
    
}
