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
public class ShapeDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number less tahn 10:");
        int n=sc.nextInt();
        System.out.println("Resultant Shape:");
        for(int i=1; i<n; i++)
        {
            for(int j=n-1; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
            int x=i;
            for(int l=2; l<=i;l++)
            {
                
                System.out.print(--x);
            }
            System.out.println();
        }
    }
    
}
