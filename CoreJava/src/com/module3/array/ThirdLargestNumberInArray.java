/*
 ThirdLargestNumberInArray

Given an array of integers, find out the third largest value in the array.
 */
package com.module3.array;

import java.util.Scanner;

public class ThirdLargestNumberInArray 
{
    public static void main(String[] args) 
    {
        ThirdLargestNumberInArray obj=new ThirdLargestNumberInArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the arrays of size is : ");
        int num=input.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the array of size is {"+num+"}");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.println("Array of Thirdd Highest number is = {"+obj.thirdLargest(arr1)+"}");
        
    }
    public int thirdLargest(int[] arr)
    {
        int len=arr.length;
       
        for(int i=len-1; i>0; i--)
        {
             int highestIndex=i;
            for(int j=i; j>=0; j--)
            {
                if(arr[j]>arr[highestIndex])
                    highestIndex=j;
            }
            int temp=arr[i];
            arr[i]=arr[highestIndex];
            arr[highestIndex]=temp;
        }
        return arr[len-3];
    }
    
}
