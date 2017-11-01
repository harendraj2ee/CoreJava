/*
 RemoveCharsFromString

Given two strings, str1 and str2 as input, remove all chars from str1 that appear in str2.
 */
package com.module2.string;

import java.util.Scanner;

public class RemoveCharsFromString
{
    public static void main(String[] args) 
    {
        RemoveCharsFromString obj=new RemoveCharsFromString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String st1=input.nextLine();
        System.out.print("Enter 2nd String : ");
        String st2=input.nextLine();
        String result=obj.remove(st1, st2);
        System.out.println("Remove the matching 1st & 2nd char  : "+result);
        
    }
    public String remove(String str1, String str2)
    {
        String str3="";
        for(int i=0; i<str1.length(); i++)
        {
            int index=str2.indexOf(str1.charAt(i));
            if(index==-1)
                str3=str3+str1.charAt(i);
        }
        return str3;
    }
    
}
