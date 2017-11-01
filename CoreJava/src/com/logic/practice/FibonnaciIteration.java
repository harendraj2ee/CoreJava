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
public class FibonnaciIteration {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Febonnaci Series:");
       FibonnaciIteration fs=new FibonnaciIteration();
        for(int i=1; i<=n; i++)
        {
            System.out.print(fs.fibonacciSeries(i)+" ");
        }
        System.out.println("");
        System.out.println("Febonnaci ratio:");
        for(int j=1; j<=n;j++)
        {
            double a=fs.fibonacciSeries(j+1);
            double b=fs.fibonacciSeries(j);
            double x=a/b;
            System.out.println(x+" ");
        }
    }
    public  int fibonacciSeries(int n)
    {
        if(n==1 || n==2)
            return 1;
        return fibonacciSeries(n-2)+fibonacciSeries(n-1);
    }
}
