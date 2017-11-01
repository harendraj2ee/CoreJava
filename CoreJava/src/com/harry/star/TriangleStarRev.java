/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harry.star;

import java.util.Scanner;

public class TriangleStarRev 
{   
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number is : ");
        int n=sc.nextInt();
        int sub=n-2;
        System.out.println("Star * print like this type of ");
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=2*sub-1; k<n; k--)
            {
                System.out.print("*");
            }
            sub--;
            System.out.println("");
        }
    }
    
}
