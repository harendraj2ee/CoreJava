/*
 SameString
Given 3 strings as input, return true if any two of the strings are the same.
 */
package com.module2.string;

import java.util.Scanner;

public class SameString 
{
    public static void main(String[] args) 
    {
        SameString obj=new SameString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String is : ");
        String st1=input.nextLine();
        
        System.out.print("Enter 2nd String is : ");
        String st2=input.nextLine();
        
        System.out.print("Enter 3rd String is : ");
        String st3=input.nextLine();
        boolean result=obj.isSame(st1, st2, st3);
        System.out.println("Two String match or not : "+result);
        
    }
    public boolean isSame(String str1, String str2, String str3)
    {
        String a=new String(str1);
        String b=new String(str2);
        String c=new String(str3);
        if(a.equals(b) || b.equals(c) || c.equals(a))
            return true;
        else
            return false;
    }
    
}
