/*
 PalindromeString


Given a string as input, check whether it is a palindrome or not. A palindrome is
a string which is same if it is read from left to right or from right to left.
 */
package com.module2.string;

import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        PalindromeString obj=new PalindromeString();
        Scanner input=new Scanner(System.in);
        System.out.print(" Enter String : ");
        String str1=input.nextLine();
        boolean result=obj.palindrome(str1);
        System.out.println("Result is : "+result);
    }
    public boolean palindrome(String str)
    {
        int len=str.length();
        String revString="";
        for(int i=0; i<len; i++)
        {
            char eachChar=str.charAt(i);
            revString=eachChar+revString;
           
        }
         if(str.equals(revString))
                return true;
        return false;
    }
    
}
