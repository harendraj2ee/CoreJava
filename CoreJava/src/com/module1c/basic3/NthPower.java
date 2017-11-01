/*
 NthPower

Given a number a, compute the nth power of a.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class NthPower
{
    public static void main(String[] args) 
    {
        NthPower obj= new NthPower();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a1=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int a2=input.nextInt();
        int result=obj.nthPower(a1, a2);
        System.out.println("a of b power number is = "+result);
        
    }
    public int nthPower(int a, int b)
    {
        int temp=1;
        if(b==0)
            return 1;
        for(int i=1; i<=b; i++)
        {
            temp=temp*a;
        }
        return temp;
    }
    
}
