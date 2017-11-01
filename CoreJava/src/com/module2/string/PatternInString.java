/*
 PatternInString

Given two strings str1 and str2 as input, determine whether str2 occurs with str1 or not.
 */
package com.module2.string;

import java.util.Scanner;

public class PatternInString 
{
    public static void main(String[] args) 
    {
        PatternInString obj = new PatternInString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String st1=input.nextLine();
        System.out.print("Enter 2nd String : ");
        String st2=input.nextLine();
        boolean result=obj.containString(st1, st2);
        System.out.println("Matching String or no : "+result);
        
        
    }
    public boolean containString(String str1, String str2)
    {
        if(str1.contains(str2))
            return true;
        else
            return false;
    }
    
}
