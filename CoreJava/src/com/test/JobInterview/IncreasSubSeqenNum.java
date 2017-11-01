/*
 2. Let L be an array of n distinct integers.

        (a)  WAP to find the length of a longest increasing subsequence of entries in L,
             For example if the entries are 11,17,5,8,6,4,7,12,3, then longest increasing subsequence is 5,6,7,12.
 */
package com.test.JobInterview;

import java.util.Scanner;

public class IncreasSubSeqenNum 
{
    public static void main(String[] args)
    { 
        IncreasSubSeqenNum obj=new IncreasSubSeqenNum();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int[] arr=new int[a];
        System.out.println("\n Enter " +a + "elements = ");
        for(int i=1; i<=a; i++)
        {
            arr[i]=input.nextInt();
        }
        int[] result=obj.increasNum(arr);
        System.out.print("Increasing Subsequence number is = ");
        System.out.println("{");
        for(int j=0; j<result.length; j++)
        {
            System.out.println(result[j]);
        }
        System.out.println("}");
            
       
        
    }
    public int[] increasNum(int[] num)
    {
        int len=num.length-1;
        int [] arr1=new int[len+1];
        int [] arr2=new int[len+1];
        int len1=0;
       for(int i=1; i<len+1; i++)
       {
           int j=0;
           //for Linear search applied here also Binary search applied 
           for(int k=len1; k>=1; k--)
           {
               if(num[arr1[k]]<num[i])
               {
                   j=k;
                   break;
               }
           }
           arr2[i]=arr1[j];
           if(j==len1 || num[i]< num[arr1[j+1]])
           {
               arr1[j+1]=i;
               len1=Math.max(len1,j+1);
           }
       }
       int [] result=new int[len1];
       int k=arr1[len1];
       for(int i=len1-1; i>=0; i--)
       {
           result[i]=num[k];
           k=arr2[k];
       }
       return result;
    }
    
}
