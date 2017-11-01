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
public class FactorialByRec {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        System.out.println("factorial:-"+factorial(n));
    }
    public static int factorial(int x)
    {
        if(x==0 || x==1)
            return 1;
        else
            return factorial(x-1)*x;
    }
}
