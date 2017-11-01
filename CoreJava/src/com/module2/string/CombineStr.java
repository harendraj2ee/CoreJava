/*
 CombineStr

Given two strings s1 and s2 as input, create a string made of the first char of s1,the first char of s2,
the second char of s1, the second char of s2, and so on. Any leftover chars go at the end of the result string.
 */
package com.module2.string;

import java.util.Scanner;

public class CombineStr 
{
    public static void main(String[] args) 
    {
        CombineStr obj=new CombineStr();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String st1=input.nextLine();
        System.out.print("Enter 2nd string : ");
        String st2=input.nextLine();
        String res=obj.combine(st1, st2);
        System.out.println("Addition of char is : "+res);
        
    }
    public String combine(String str1, String str2)
    {
        int len1=str1.length();
        int len2=str2.length();
        String result="";
        int i;
        for(i=0; i<len1 && i<len2; i++)
        {
            result=result+str1.charAt(i)+str2.charAt(i);
        }
        if(i==len1)
        {
            result+=str2.substring(i);
        }
        else
        {
            result+=str1.substring(i);
        }
        return result;
    }
    
}
