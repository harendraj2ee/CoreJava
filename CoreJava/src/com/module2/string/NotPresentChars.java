/*
 NotPresentChars

Given two strings s1 and s2 as input, return a string where the characters of
s1 which are not in s2 have been replaced by #.
 */
package com.module2.string;

import java.util.Scanner;

public class NotPresentChars
{
    public static void main(String[] args) 
    {
        NotPresentChars obj=new NotPresentChars();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String st1=input.nextLine();
        System.out.print("Enter 2nd String : ");
        String st2=input.nextLine();
        String result=obj.replace(st1, st2);
        System.out.println("the characters of s1 which are not in s2 have been replaced by # : "+result );
        
    }
    public String replace(String str1, String str2)
    {
         int len= str1.length();
 String res="";
 //char c='';
 for(int i=0; i<len; i++)
 {
     int index=str2.indexOf(str1.charAt(i));
     if(index==-1)
     {
         res=res+'#';
     }
     else
     {
         res=res+str1.charAt(i);
     }
 }
 return res;

    }
    
}
