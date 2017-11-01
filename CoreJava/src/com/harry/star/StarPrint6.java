/*
Enter a number is : 5
To print * star like this 
*   *
 * * 
  *  
 * * 
*   * 

 */
package com.harry.star;

import java.util.Scanner;

public class StarPrint6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number is : ");
        int n=sc.nextInt();
        System.out.println("To print * star like this ");
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<n;j++)
                {
                    if(i==j)
                        System.out.print("*");
                    else if(i+j==n-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            
            System.out.println();
        }  
       
    }
}
