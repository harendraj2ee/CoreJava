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
public class ShapeOfStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Upper half of diamond:");
       
        for(int i=0; i<n; i++)
        {
            for(int k=n-1; k>i;k--)
            {System.out.print(" ");}
            for(int j=0; j<2*i+1; j++)
            {System.out.print("*");}
            
            System.out.println();
        }
        System.out.println("Resultant lower half Shape:");
        int n1=n-2;
        for(int i=0; i<n-1; i++)
        {
            for(int k=0; k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n1*2+1; j>0; j--)
            {
                System.out.print("*");
            }
            n1--;
            
            System.out.println();
        }
    }
}
