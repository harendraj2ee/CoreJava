/*
 LargestIn2D
Given a 2D array consisting of ints as input, return the largest int in it.
 */
package com.module3.array;

import java.util.Scanner;

public class LargestIn2D 
{
    public static void main(String[] args) 
    {
       LargestIn2D obj=new LargestIn2D();
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the Array of Rows Size is : ");
        int row=input.nextInt();
        System.out.println("Rows Size is = {"+row+"}");
        System.out.print("Enter the Array of Columns Size is : ");
        int column=input.nextInt();
        System.out.println("Columns Size is = {"+column+"}");
        int[][] arr1=new int[row][column];
        System.out.println("Array of 2D is which one largest =: ");
        System.out.println("{");
        for(int i=0; i<row; i++)
        {
            {
                for(int j=0; j<column; j++)
                    arr1[i][j]=input.nextInt();
                //System.out.println("}");
                //System.out.println("Enter the element of Columns is = ");
                //System.out.println("{");
            }   
            
        }
        System.out.println("}");
        
        System.out.println("2D array of Largest element is ={ "+obj.findLargest(arr1)+"}");
    }
    public int findLargest(int[][] arr)
    {
        int len=arr.length;
        int max=0;
        for(int i=0; i<len; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(max<arr[i][j])
                    max=arr[i][j];
            }
        }
        return max;
    }
    
}
