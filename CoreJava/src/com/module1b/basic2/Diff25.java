/*
 Diff25

Given three ints as input , return true if one of them is 25 or more less than one of the other numbers.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class Diff25
{
    public static void main(String[] args)
    {
        Diff25 obj=new Diff25();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int num1=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int num2=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int num3=input.nextInt();
        boolean result=obj.checkDiff25(num1, num2, num3);
        System.out.println("Result is = "+result);
        
    }
    public boolean  checkDiff25(int a, int b, int c)
    {
        int x=a-b;
        int y=b-c;
        int z=c-a;
        if(x>=25 || y>=25 || z>=25 || x<=(-25) || y<=(-25) || z<=(-25))
            return true;
        else
            return false;
    }
    
}
