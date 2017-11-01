/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harry.star;

import java.util.Scanner;

public class StarPrint8 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number is :");
        int n=sc.nextInt();
        System.out.println("Shape of Star is print like this ");
        for(int i=n; i>0; i--)
        {
            for(int j=n-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=i*2-1; k>0; k-- )
            {
                System.out.print("*");
            }
            
            System.out.println();
            
        }
        
    }
    
}
