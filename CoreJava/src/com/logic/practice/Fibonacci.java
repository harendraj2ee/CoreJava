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
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int i=1;
        int j=0;
        int k;
        System.out.println("Fibonacci Series");
        if(n==1)
            System.out.print(1);
        while(n>0)
        {
            System.out.print(i+"\t");
            k=j;
            j=i;
            i=k+j;
            n--;
        }
    }
}
