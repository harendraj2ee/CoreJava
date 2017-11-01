/*
ReverseArray

Given an array of integers as input, output an array which has the elements in reverse order.
 */
package com.module3.array;

import java.util.Scanner;

public class ReverseArray 
{
    public static void main(String[] args) 
    {
        ReverseArray obj=new ReverseArray();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array of size is : ");
        
        int num=input.nextInt();
        int[] arr2=new int[num];
        System.out.println("Enter the array of size is = {"+num+"}");
        System.out.println("Etner the array of element is : {");
        for(int i=0; i<num; i++)
        {
            arr2[i]=input.nextInt();
        }
        System.out.println("}");
        System.out.println("Reverse array is = ");
        System.out.println("{");
        int[] result=obj.reverse(arr2);
        for(int k=0; k<num; k++)
        {
            System.out.println(result[k]);
        }
        System.out.println("}");
        
        
    }
    public int[] reverse(int[] arr)
    {
        int len=arr.length;
        int a=len-1;
        int[] res=new int[len];
        for(int i=0; i<len; i++)
        {
            res[i]=arr[a--];
        }
        return res;
    }
    
}
