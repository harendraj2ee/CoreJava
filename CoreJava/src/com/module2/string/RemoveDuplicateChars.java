/*
 RemoveDuplicateChars

Given a string as input, remove all chars from the string that appear again. That
is, while reading a string if a char has appeared previously it will be removed.
 */
package com.module2.string;

import java.util.Scanner;

public class RemoveDuplicateChars 
{
    public static void main(String[] args) 
    {
        RemoveDuplicateChars obj=new RemoveDuplicateChars();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1=input.nextLine();
        String result=obj.remove(str1);
        System.out.println("Remove dublicate String is : "+result);
    }
    public String remove(String str)
    {
        int len =str.length();
        String newString=""+str.charAt(0);
        for(int i=0; i<len; i++)
        {
            char ch=str.charAt(i);
            if(newString.indexOf(ch)==-1)
                newString=newString+str.charAt(i);
        }
        return newString;
    }
    
}
