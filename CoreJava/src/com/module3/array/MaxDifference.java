/*
 MaxDifference

Given an array of ints as input, compute the difference between the largest and smallest numbers in the array.
 */
package com.module3.array;

import java.util.Scanner;


public class MaxDifference 
{
    public static void main(String[] args)
    {
        MaxDifference obj=new MaxDifference();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a arrays of size is : ");
        int num=input.nextInt();
        int arry[]=new int[num];
        System.out.println("Enter a element of arrays size - "+num+ ":");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arry[i]=input.nextInt();
        }
        System.out.println("}");
        int  result=obj.maxDiffNum(arry);
        System.out.println("Difference of Max & Min numbers is : "+result);
        
    }
    public int maxDiffNum(int numbers[])
    {
        int min=numbers[0];
        int max=0;
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
            if(numbers[i]<min)
            {
                min=numbers[i];
            }
        }
        return max-min;
    }
}
