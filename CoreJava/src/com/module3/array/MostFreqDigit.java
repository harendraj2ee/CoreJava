/*
 MostFreqDigit

Given an array of numbers as input, return the digit which occurs the maximum number of times in the input.
 */
package com.module3.array;

import java.util.Scanner;

public class MostFreqDigit 
{
    public static void main(String[] args)
    {
        MostFreqDigit obj=new MostFreqDigit();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Array of Size is : ");
        int num=input.nextInt();
        int[] arr=new int[num]; 
        System.out.println("Arrays of size is = {"+num+"}");
        System.out.println("Enter the array of element is =");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.println("Maximum number of times Digits is ={"+obj.frequentDigit(arr)+"}");
        
    }
    public int frequentDigit(int[] numbers)
    {
         int[] count= new int[10];
    for(int num: numbers)
    {
        calcCount(count, num);
    }
    int dig=0;
    int max=0;
    for(int i=0; i<count.length; i++)
    {
        if(count[i]>max)
        {
            max=count[i];
            dig=i;
        }
    }
    return dig;
	}
    
	
	public void calcCount(int[] arr, int num)
	{
	    if(num==0)
	    {
	        arr[0]++;
	    }
	    while(num>0)
	    {
	        int d=num%10;
	        arr[d]++;
	        num=num/10;
	    }
    }
    
}
