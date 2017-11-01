/*
 StringArrayOfNumbers

Given a number n as input, return a new string array of length n, containing the strings "0", "1", "2" so on till n-1. If n=0, return an array of length 0.
 */
package com.module3.array;

import java.util.Scanner;

public class StringArrayOfNumbers 
{
    public static void main(String[] args) 
    {
        StringArrayOfNumbers obj=new StringArrayOfNumbers();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter array of size is : ");
        int a=input.nextInt();
        
        String[] result=obj.make(a);
        for(int i=0; i<a; i++)
        {
            System.out.println(result[i]);
        }
       
    }
    public String[] make(int num)
    {
        String[] arr=new String[num];
        for(int i=0; i<num; i++)
        {
            arr[i]=""+i+"";
        }
        return arr;
   }
    
}
