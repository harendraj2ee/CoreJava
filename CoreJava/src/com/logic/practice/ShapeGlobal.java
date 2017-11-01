/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;

import java.util.Scanner;

/**
 *
 * @author Welcome
 */
public class ShapeGlobal {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter odd number:");
        int n=sc.nextInt();
        System.out.println("Resultant shape");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=n/2; j++)
            {
                
                    if(i+j==n-1 || i==j)
                    
                        System.out.print("*");
                    else
                        System.out.print(" ");
                   
            }
            System.out.println();
        }
    }  
}
