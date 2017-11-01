/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harry.star;


import java.util.Scanner;

public class Factoril {

    public static void main(String[] args) {
        Factoril obj = new Factoril();
        System.out.print("Enter a number is = ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Factorial is = " + obj.factorialNum(num));

    }

    public int factorialNum(int a) 
    {
        int fact=1;
        for(int i=1; i<=a; i++)
        {
            fact=fact*i;      
        }
        return fact;
       /*if(a==0 || a==1)  //this is also recursion method
           return 1;
       else
           return factorialNum(a-1)*a; */
        
    }
}
