/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harry.star;

import java.util.Scanner;

public class StarPrint7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number is : ");
        int n=sc.nextInt();
        System.out.println("Output like this ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
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
