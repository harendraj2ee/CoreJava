/*
 CreateDomino

Given and int n as input where n>=0, create an array with the pattern {1,1,2,1,2,3,… 1,2,3..n}.
 */
package com.module3.array;

import java.util.Scanner;


public class CreateDomino 
{
    public static void main(String[] args) 
    {
        CreateDomino obj=new CreateDomino();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array of size is : ");
        int a=input.nextInt();
        System.out.println("Enter the array of size = {"+a+"}");
        int[] result=obj.create(a);
        System.out.print("Domino Pattern is = ");
        System.out.print("{");
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+",");
        }
        System.out.println("}");
    }
    public int[] create(int num)
    {
        int len=(num*(num+1))/2;
        int[] arr=new int[len];
        int k=0;
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                arr[k++]=j;
            }
        }
        return arr;
    }
    
}
