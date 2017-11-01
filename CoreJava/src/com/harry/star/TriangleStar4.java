/*
 Enter a number is 
10
Triangle like this 
*
***
*****
*******
*********
***********
*************
***************
*****************
*******************
 */
package com.harry.star;

import java.util.Scanner;


public class TriangleStar4
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number is ");
        int n=sc.nextInt();
        System.out.println("Triangle like this ");
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>i; j--)
            {
                System.out.print("");
            }
            for(int k=0; k<2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
}
