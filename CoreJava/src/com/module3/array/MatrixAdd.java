/*
 MatrixAdd
Given two matrices M1 and M2, the objective to add them. Each matrix is provided as an 
int[][], a 2 dimensional integer array. The expected output is also 2 dimensional integer array.
 */
package com.module3.array;

import java.util.Scanner;


public class MatrixAdd 
{
    public static void main(String[] args)
    {
        MatrixAdd obj=new MatrixAdd();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st array of Rows size is : ");
        int row=input.nextInt();
        System.out.println("Size of  Row is = {"+row+"}");
        System.out.print("Enter the 1st Array of Columns Size is : ");
        int column=input.nextInt();
        System.out.println("Size of Columns is = {"+column+"}");
        int[][] arr1=new int[row][column];
        System.out.println("First Matrix is = ");
        System.out.println("{");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                arr1[i][j]=input.nextInt();
            }
        }
        System.out.println("}");
        System.out.print("Enter the 2nd Array of Rows Size is : ");
        int row1=input.nextInt();
        System.out.println("Rows of Size is = {"+row1+"}");
        System.out.print("Enter the 2nd Array of Columns Size is : ");
        int column1=input.nextInt();
        System.out.println("Size of Columns is ={"+column1+"}");
        System.out.println("Second Matrix is = ");
        System.out.println("{");
        int[][] arr2=new int[row1][column1];
        for(int i=0; i<row1; i++)
        {
            for(int j=0; j<column1; j++)
            {
                arr2[i][j]=input.nextInt();
            }
        }
        System.out.println("}");
        int[][] res=obj.add(arr1, arr2);
        System.out.print("Sum of two Matrix is ={");
        for(int p=0; p<arr1.length; p++)
        {
            for(int q=0; q<arr2.length; q++ )
            {
                System.out.print(res[p][q]+" ");
            }
        }
        System.out.print("}");
        
    }
    public int[][] add(int[][] m1, int[][] m2)
    {
        int rows=m1.length;
        int columns=m1[0].length;
        int[][] sum=new int[rows][columns];
        {
            for(int i=0; i<rows; i++)
            {
                for(int j=0; j<columns; j++)
                
                    sum[i][j]=m1[i][j]+m2[i][j];
               
            }
        }
        return sum;
    }
    
}
