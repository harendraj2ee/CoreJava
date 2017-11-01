/*
 SwapLastChars

Given a string as input, return the string with its last 2 chars swapped. If the string
has less than 2 chars, do nothing and return the input string.
 */
package com.module2.string;

import java.util.Scanner;

public class SwapLastChars 
{
    public static void main(String[] args) 
    {
        SwapLastChars obj=new SwapLastChars();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1=input.nextLine();
        String result=obj.swap(str1);
        System.out.println("Last char swap is : "+result);
        
    }
    public String swap(String str)
    {
        int len=str.length();
        //raj 0=r, 1=a, 2=j
        int x=len-1; //3-1=2 j
        int y=len-2;//3-2=1 a
        if(len<2)
        {
            return str;
        }
        String s=str.substring(0,len-2);
        char ch1=str.charAt(x);
        char ch2=str.charAt(y);
        return s+ch1+ch2;
        
    }
    
}
