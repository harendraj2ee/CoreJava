/*
 JoinChars

Given two strings s1 and s2 of equal length as input, the expected output is a string which the 1st char
from s1, then 1st char from s2, then 2nd char from s1, then 2nd char from s2 and so on.
 */
package com.module2.string;

import java.util.Scanner;

public class JoinChars 
{
    public static void main(String[] args)
    {
     JoinChars obj=new JoinChars();
     Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String = ");
        String str3=input.nextLine();
        System.out.print("Enter 2nd String = ");
        String str4=input.nextLine();
        String result=obj.join(str3, str4);
        System.out.println("Adding Equal length of 1st String & 2nd String individual char = "+result);
     
    }
    public String join(String str1, String str2)
    {
        String a="";
        for(int i=0; i<str1.length(); i++)
        {
            String b=str1.charAt(i)+""+str2.charAt(i);
            a+=b;
        }
        return a;
    } 
}
