




/*
 CountCommonChars

Given 2 strings, str1 and str2, as input, return the count of the chars which are in the same position in str1 and str2.
 */
package com.module2.string;

import java.util.Scanner;


public class CountCommonChars
{
    public static void main(String[] args) 
    {
        CountCommonChars obj=new CountCommonChars();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String st1=input.nextLine();
        System.out.print("Enter 2nd String : ");
        String st2=input.nextLine();
        int result=obj.count(st1, st2);
        System.out.println("Count in 1st & 2nd String match same position char : "+result);
        
    }
    public int count(String str1, String str2)
    {
        int len=str1.length();
        int len2=str2.length();
        int i=0;
        int count=0;
        if(len<=len2)
        {
            i=len;
        }
        else
            i=len2;
        for(int j=0;j<i; j++)
        {
            if(str1.charAt(j)==str2.charAt(j))
                count++;
        }
        return count;
    }
    
}
