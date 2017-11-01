/*
 SecondHalf

Given a string as input, output the second half of the string. You can assume that the length of the string is a even number.
 */
package com.module2.string;

import java.util.Scanner;


public class SecondHalf
{
    public static void main(String[] args) 
    {
      SecondHalf obj=new SecondHalf();
      Scanner input=new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String str1=input.nextLine();
        String result=obj.halfString(str1);
        System.out.println("Second Half word is : "+result);
        
    }
    public String halfString(String word)
    {
        String secHalf="";
        int k=word.length()/2;
        for(int i=k; i<word.length(); i++)
        {
            secHalf=secHalf+word.charAt(i);
            
        }
        return secHalf;
    }
    
}
