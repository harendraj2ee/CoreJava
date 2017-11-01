/*
 DoubleString

Given a string, return a string where for every char in the original, there are two chars.
 */
package com.module2.string;

import java.util.Scanner;


public class DoubleString 
{
    public static void main(String[] args) 
    {
        DoubleString obj =new DoubleString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str2=input.nextLine();
        String result=obj.doubleStr(str2);
        System.out.println("Every char double double is : "+result);
        
    }
    public String doubleStr(String str)
    {
        String str1="";
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            char ch1=str.charAt(i);
            str1+=ch+""+ch1;
        }
        return str1;
    }
    
}
