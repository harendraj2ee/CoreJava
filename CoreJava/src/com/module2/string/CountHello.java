/*
 CountHello

Return the number of times that the string "Hello" appears anywhere in the given string.
 */
package com.module2.string;

import java.util.Scanner;


public class CountHello 
{
    public static void main(String[] args)
    {
        CountHello obj=new CountHello();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String st1=input.nextLine();
        int result=obj.count(st1);
        System.out.println("No of Hello count is : " +result);
        
    }
    public int count(String str)
    {
        // String str2=str.toUpperCase();
        String str1=str.toLowerCase();
        int index=str1.indexOf("hello");
        int count=0;
        while(index!=-1)
        {
            index=str1.indexOf("hello", index+1);
            count++;
        }
        return count;
    }
    
}
