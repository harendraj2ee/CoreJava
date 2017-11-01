/*
 SplitSumArray

Given an array of ints as input, return true if it is possible to split the array into 
two so that the sum of the numbers on the left is equal to the sum of the numbers on the right.
 */
package com.module3.array;

import java.util.Scanner;


public class SplitSumArray 
{
    public static void main(String[] args)
    {
        SplitSumArray obj=new SplitSumArray();
        Scanner input=new Scanner(System.in);
        int i=0;
        System.out.print("Enter the array of size is : ");
        int num=input.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the array of size is = {"+num+"}");
        System.out.println("{");
        for(i=0; i<num; i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.println("Result is = "+obj.canSplit(arr1));
        
    }
    public boolean canSplit(int[] arr)
    {
        int len=arr.length;
        int sum=0;
        for(int i=0; i<len; i++)
        {
            sum+=arr[i];
        }
        int sum1=0;
        if(sum%2==0)
        {
            sum=sum/2;
            for(int j=0; j<len-1; j++)
            {
                sum1+=arr[j];
                if(sum1==sum)
                    return true;
            }
        }
        return false;
    }
    
}
