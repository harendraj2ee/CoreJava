/*
 JoinDescArray
Given two arrays, arr1 and arr2, that have been sorted in descending order, output 
an array which appends the values from both arr1 and arr2 while being sorted in descending order.
 */
package com.module3.array;

import java.util.Scanner;

public class JoinDescArray 
{
    public static void main(String[] args)
    {
       JoinDescArray obj=new JoinDescArray();
       Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st Array of Size is : ");
        int num1=input.nextInt();
        int[] arr1=new int[num1];
        System.out.println("First Array of Size is = {"+num1+"}");
        System.out.println("Eneter 1st array of element is = ");
        System.out.println("{");
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.print("Enter the 2nd Arrays of size is : ");
        int num2=input.nextInt();
        int[] arr2=new int[num2];
        System.out.println("Second of Array of Size is = {"+num2+"}");
        System.out.println("Enter 2nd Array of Element is = ");
        System.out.println("{");
        for(int j=0; j<arr2.length; j++)
        {
            arr2[j]=input.nextInt();
        }
        System.out.println("}");
        int[] result=obj.join(arr1, arr2);
        System.out.print("Join in Array of Decending Order is = {");
        for(int k=0; k<result.length; k++)
        {
            System.out.print(result[k]+" ");
        }
        System.out.print("}");
    }
    public int[] join(int[] arr1, int[] arr2)
    {
      int len1=arr1.length;
      int len2=arr2.length;
      int len=len1+len2;
      int i=0;
      int j=0;
      int k=0;
      int[] result=new int[len];
      while(j<len1 && k<len2)
      {
          if(arr1[j]>arr2[k])
          {
              result[i++]=arr1[j++];
          }
          else
          {
              result[i++]=arr2[k++];
          }
      }
      if(k!=len2)
      {
          while(k<len2)
          {
              result[i++]=arr2[k++];
          }
      }
      else if(j!=len1)
      {
          while(j<len1)
          {
              result[i++]=arr1[j++];
          }
      }
      /*if(arr1[0]>arr2[0])
      {
         result[i++]=arr1[j++];
      }
      else
      {
          result[i++]=arr2[k++];
      }*/
      return result; 
    }
    
}
