/*
 PermutationString

Given two strings str1 and str2 as input, check whether the strings are a permutation of each other. 
str1 is a permutation of str2 if all the characters of str2 can be arranged in some way to form str1.
 */
package com.module2.string;

import java.util.Scanner;

public class PermutationString 
{
    public static void main(String[] args) 
    {
        PermutationString obj=new PermutationString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String st1=input.nextLine();
        System.out.print("Enter 2nd String : ");
        String st2=input.nextLine();
        boolean result=obj.isPermutation(st1, st2);
        System.out.println("Result is : "+result);
        
    }
    public boolean isPermutation(String str1, String str2)
    {
        int lenStr1=str1.length();
        int lenStr2=str2.length();
        if(lenStr1!=lenStr2)
        {
            return false;
        }
        for(int i=0; i<lenStr1; i++)
        {
            char ch2=str1.charAt(i);
            int count1=countingChar(ch2, str1);
            int count2=countingChar(ch2, str2);
            if(count1!=count2)
            {
                return false;
            }
        }
        return true;
    }
    //counting number of a particular character in string
    private int countingChar(char ch, String str)
    {
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            char ch1=str.charAt(i);
            if(ch==ch1)
            {
                count++;
            }
        }
        return count;
    }
    
}
