/*
 NextMultiple37

Given a number num as input, find the smallest number greater than num that is a multiple of both 3 and 7.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class NextMultiple37 
{
    public static void main(String[] args)
    {
        NextMultiple37 obj=new NextMultiple37();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.findNextMultiple37(a);
        System.out.println("A number is Next multiple of 3 & 7 is = "+result);
        
    }
    public int findNextMultiple37(int num)
    {
        int mul=0;
        //for(int i=num; i<=10000; i++)
        for(int i=num; i>=num; i++)
        {
            if(i%3==0 && i%7==0)
                break;
                mul=i+1;
        }
        return mul;
    }
}
