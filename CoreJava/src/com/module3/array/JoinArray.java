/*
 JoinArray
 
Given two arrays, arr1 and arr2 as input, return an array which has the values of arr1 followed by those of arr2.
 */
package com.module3.array;

import java.util.Scanner;

public class JoinArray
{
    public static void main(String[] args)
    {
        JoinArray obj=new JoinArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st array of size is : ");
        
        int num1=input.nextInt();
        int[] array1=new int[num1];
        System.out.println("First array of size is = {"+num1+"}");
        
        for(int i=0; i<num1; i++)
        {
            array1[i]=input.nextInt();
        }
       // Scanner input2=new Scanner(System.in);
        System.out.print("Enter the 2nd Array of size is : ");
        int num2=input.nextInt();
        int[] array2=new int[num2];
        System.out.println("Second array of size is = {"+num2+"}");
        
        for(int j=0; j<num2; j++)
        {
            array2[j]=input.nextInt();
        }
        
        //int[] result=obj.joinTwoArray(array1, array2);
        System.out.print("Joint Array:{");
        for(int k=0; k<num1+num2; k++)
        {
            System.out.print(obj.joinTwoArray(array1, array2)[k]);
        }
        System.out.println("}");
       // System.out.println("size"+obj.joinTwoArray(array1, array2).length);
        //System.out.println("joint"+obj.joinTwoArray(array1, array2));
        
        
    }
    public int[] joinTwoArray(int[] arr1, int[] arr2)
    {
        int len1=arr1.length;
        int len2=arr2.length;
        int len=len1+len2;
        int[] arr=new int[len];
        for(int i=0; i<len1; i++)
        {
            arr[i]=arr1[i];
        }
        for(int j=0; j<len2; j++)
        {
            arr[len1+j]=arr2[j];
        }
        return arr;
    }
    
}
