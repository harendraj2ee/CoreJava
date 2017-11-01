/*
RemoveZeros

Given an array of integers return an array in the same order with all 0's removed.
 */
package com.module3.array;

import java.util.Scanner;

public class RemoveZeros 
{
    public static void main(String[] args) 
    {
        RemoveZeros obj=new RemoveZeros();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array of size is : ");
        int num=input.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the array of size is : {"+num+"}");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        int[] res= obj.romove0(arr1);
        System.out.print("Remove all Zero is= {");
        for(int i=0; i<res.length; i++)
        {
            System.out.print(res[i]);
        }
        System.out.print("}");
        
    }
    public int[] romove0(int[] arr)
    {
        int len=arr.length;
        int len1=0;
        for(int i=0; i<len; i++)
        {
            if(arr[i]!=0)
                len1++;
        }
        int[] result=new int[len1];
        int j=0;
        for(int i=0; i<len; i++)
        {
            if(arr[i]!=0)
                result[j++]=arr[i];
        }
        return result;
        
    }
    
}
