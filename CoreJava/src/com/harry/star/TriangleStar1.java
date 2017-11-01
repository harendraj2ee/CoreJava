/*
 Enter a Number to Print Star 
10
Triagle Sape is : 
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

public class TriangleStar1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number to Print Star ");
        int n=sc.nextInt();
        System.out.println("Triagle Sape is : ");
        for(int i=0; i<n; i++)
        {
            for(int j=n-1; j>i; j--)
            {
                System.out.print("  ");
            }
            for(int k=0; k<2*i+1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
