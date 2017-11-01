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
public class Permutation {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number for Permutaion");
        int n=sc.nextInt();
        if(n==0 || n==1)
         System.out.println(1);
        else{
        int n1=1;
       // int n2;
        for(int i=1; i<=n;i++)
        {
            n1=n1*i;
            
        }
       // n2=n1/n;
        System.out.println("Result:"+n1);
        }
    }
}
