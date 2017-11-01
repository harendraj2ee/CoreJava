/*
 IsSortedArray
 * 
Given an array of integers as input, return true if the array is sorted. Note that the array can be sorted in either ascending or descending order.
 */
package com.module3.array;

import java.util.Scanner;

public class IsSortedArray 
{
    public static void main(String[] args) 
    {
        IsSortedArray obj=new IsSortedArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array of size is : ");
        
        int num=input.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the array of size is = {"+num+"}");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.println("Result is = "+obj.isSorted(arr1));
    }
    public boolean isSorted(int[] arr)
    {
        int len=arr.length;
        boolean ascending=true;
        if(arr[0]>arr[len-1])
        {
            ascending=false;
        }
        for(int i=0; i<len-1; i++)
        {
            if(ascending)
            {
                if(arr[i]>arr[i+1])
                    return false;
            }
               else
            {
               if(arr[i]<arr[i+1])
                   return false;               
               
            }
        }
        return true;
    }
    
}
