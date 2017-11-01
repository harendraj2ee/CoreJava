/*
 RemoveDuplicates

Given an array of numbers as input, return an array with all the duplicate values removed.
 */
package com.module3.array;

import java.util.Scanner;

public class RemoveDuplicates 
{
    public static void main(String[] args) 
    {
        RemoveDuplicates obj=new RemoveDuplicates();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Arrays of Size is : ");
        int num=input.nextInt();
        int[] arr1=new int[num];
        System.out.println("Array of Size is = {"+num+"}");
        System.out.println("Enter array of element is = ");
        System.out.println("{");
        for(int i=0; i<arr1.length; i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        int[] result=obj.remove(arr1);
        System.out.print("Remove the dublicate in number is = {");
        for(int j=0; j<result.length; j++)
        {
            System.out.print(result[j]+" ");
        }
        System.out.print("}");
        
        
    }
    public int[] remove(int[] arr)
    {
         int len=arr.length;
      int j=0;
      int[] a= new int[len];
      for(int i=0; i<len; i++)
      {
          if(!isPresent(arr[i], a))
          {
              a[j++]=arr[i];
          }
      }
      int x=0;
      int[] result=new int[j];
      for(int i=0; i<len; i++)
      {
          if(!isPresent(arr[i], result))
          {
              result[x++]=arr[i];
          }
      }
      //result=a;
      return result;
   }
      public boolean isPresent(int c, int[]a)
      {
          for(int i=0; i<a.length;i++)
          {if(a[i]==c)
          return true;
          
          }
          return false;
    }
    
}
