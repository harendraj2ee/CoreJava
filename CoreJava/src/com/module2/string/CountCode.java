/*
 CountCode

Given a string as input, count the number of times, the string "code" appears in the input string. 
Note that while counting the occurrence of "code", we’ll accept any letter in place 
of 'd'. So "core", "cope", "come" etc will also be added to the count.
 */
package com.module2.string;

import java.util.Scanner;

public class CountCode
{
    public static void main(String[] args)
    {
        CountCode obj=new CountCode();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String  is : ");
        String str1=input.nextLine();
        int result=obj.count(str1);
        System.out.println("Result is : "+result);
    }
    public int count(String str)
    {
        char ch1,ch2,ch3;
        int count=0;
        for(int i=0; i<str.length()-3; i++)
        {
            ch1=str.charAt(i);
            ch2=str.charAt(i+1);
            ch3=str.charAt(i+3);
            if(ch1=='c' && ch2=='o' && ch3=='e')
                count++;
        }
        return count;
    }
    
}
