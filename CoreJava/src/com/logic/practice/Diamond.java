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
public class Diamond {
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
        for(int i=0; i<n-1;i++)
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
