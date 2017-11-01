/*
MostFreqNum
Given an array of numbers as input, return the number which occurs the maximum number of times in the input.
 */
package com.module3.array;

import java.util.Scanner;

public class MostFreqNum 
{
    public static void main(String[] args) 
    {
        MostFreqNum obj=new MostFreqNum();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Array of Size is  : ");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Array of Size is = {"+num+"}");
        System.out.println("Enter array of element is = ");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.println("The Maximum number of times is = {"+obj.frequentNumuber(arr)+"}");
        
    }
    public  int frequentNumuber(int[] numbers)
    {
        int store = numbers[0];
	      int count=0,max=0;
	      for(int i=0;i<numbers.length-1;i++)
	      {
	          for(int j=i+1;j<numbers.length;j++)
	          {
	              if(numbers[i]==numbers[j])
	              {
	                count++;
	              } 
	          }
	          if(count>max)
	          {
	              max=count;
	              store = numbers[i];
	          }
	          count=0;
	      }
	      return store;
    }
}
