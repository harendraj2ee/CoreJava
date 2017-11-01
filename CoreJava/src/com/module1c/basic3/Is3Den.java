/*
 s3Den

A number is defined as a 3den if it is a multiple of 3 or has the digit 3 in it.
Given a number as input, determine whether it is a 3den or not.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class Is3Den 
{
    public static void main(String[] args) 
    {
        Is3Den obj=new Is3Den();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        boolean result=obj.is3Den(a);
        System.out.println("Result is = "+result);
        
    }
    public boolean is3Den(int num)
    {
       int i=0;
        if(num%3==0)
            return true;
        while(num>0)
        {
            i=num%10;
             if(i==3)
              num=num/10;
            return true;
            
          }
         
        return false;
    }
    
}
