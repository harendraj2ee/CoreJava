/*
 Enter the less than 10 number is : 
6
Triagle shape is * : 
     *
    ***
   *****
  *******
 *********
***********
 */
package com.harry.star;

import java.util.Scanner;

public class TriangleStar
{
    public static void main(String[] args)
    {
        System.out.println("Enter the less than 10 number is : ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("Triagle shape is * : ");
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }     
    }
    
}
