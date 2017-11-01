/*
 CountEvens

Given an array of ints as input, return the number of even ints in it.
 */
package com.module3.array;

import java.util.Scanner;

public class CountEvens
{
    public static void main(String[] args)
    {
        
        CountEvens obj=new CountEvens();
        Scanner input=new Scanner(System.in);
       
        System.out.print("Enter the size of an array :");
        int num=input.nextInt();
       int array1[] = new int[num];
        System.out.println("Enter Elements of Arrays of Size-"+num+":");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            array1[i]=input.nextInt();
        }
        System.out.println("}");
        int result=obj.count2(array1);
        System.out.println("Count of Even number is : " +result );
       
    }
   
    
    public int count2(int numbers[])
    {
        int count=0;
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]!=0)
            {
                if(numbers[i]%2==0)
                count++;
            }
        }
        return count;
    }
    
}
