/*
 Write a Program is 

Enter Number less than 10:-
5
Diamond shape of *:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
package com.harry.star;

import java.util.Scanner;

public class Dimond1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number less than 10:-");
        int n=sc.nextInt();
        System.out.println("Diamond shape of *:");
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
        int a=n-2;
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=a*2+1; k>0;k--)
            {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
            
        }
    }


