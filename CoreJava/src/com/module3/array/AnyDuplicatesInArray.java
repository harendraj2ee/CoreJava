/*
 AnyDuplicatesInArray

Given an array of integers, check whether any number has been repeated in the array. That is, whether the array has any duplicates.
 */
package com.module3.array;

import java.util.Scanner;

public class AnyDuplicatesInArray 
{
    public static void main(String[] args)
    {
        AnyDuplicatesInArray obj=new AnyDuplicatesInArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array of size is : ");
        int num=input.nextInt();
        System.out.println("Enter the array of size is = {"+num+"}");
        int[] arr1=new int[num];
        System.out.println("{");
        for(int i=0; i<num;i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.println("Number is Dublicate : "+obj.anyDublicate(arr1));
        
        
        
    }
    public boolean anyDublicate(int[] arr)
    {
        int len=arr.length;
        for(int i=0; i<len; i++)
            
        {
            for(int j=i+1; j<len; j++)
            {
                if(arr[i]==arr[j])
                    return true;
            }
        }
        return false;
    }
    
}
