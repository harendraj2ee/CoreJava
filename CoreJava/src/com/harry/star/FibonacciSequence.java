/*
 *The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
The next number is found by adding up the two numbers before it. Similarly, the 3 is found by adding the two numbers before it (1+2),
 */
package com.harry.star;

import java.util.Scanner;

public class FibonacciSequence 
{
    public static void main(String[] args) {
        int first=0,second=1,next;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=sc.nextInt();   
        System.out.println("Fibonacci Sequence is ");
        for(int i=0; i<a; i++)
        {
             if ( i <= 1 )
            next = i;
      else
      
         next = first + second;
         first = second;
         second = next;
      
            System.out.println(next);
        } 
        /*
        int current=1,last=0;
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(last);
        System.out.println(current);
        int lastlast=2;
        for(int i=2; i<num; i++)
        {
            lastlast=last;
            last=current;
            current=lastlast+last;
            System.out.println(current); 
        }
       */
    
    }
    
}
