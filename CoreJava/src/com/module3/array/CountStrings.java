/*
 CountStrings

You have been given an array of strings and an int size as input. Return the number of strings in the input array which have the length as size.
 */
package com.module3.array;

import java.util.Scanner;

public class CountStrings 
{
    public static void main(String[] args)
    {
       
        CountStrings obj=new CountStrings();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a String array of size is : ");
        
        int len1=input.nextInt();
        String[] arr=new String[len1];
        
        System.out.println("Enter the elements of String array:");
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=input.nextLine();
            
        }
        System.out.println("Enter String length to count:");
        int len2=input.nextInt();
        int result=obj.stringOfSize(arr, len2);
        System.out.println("result count:"+result);
        
        
    }
    public int stringOfSize(String[] strs, int len)
    {
        int count=0;
        for(int i=0; i<strs.length; i++)
        {
            if(len==strs[i].length())
            {
                count++;
            }
        }
        return count;
    }
    
}
