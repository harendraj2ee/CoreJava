/*
 LargerThanOne
Given three numbers as input, num, num1 and num2, return true if num is greater than atleast one of num1 and num2. 
Do not use if statement to solve this problem.
 */
package com.module1a.basic;

import java.util.Scanner;

public class LargerThanOne 
{
    public static void main(String[] args)
    {
        LargerThanOne obj=new LargerThanOne();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number is = ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        boolean bool =obj.largerThanOne(a, b, c);
        
        System.out.println("Boolean Result is = "+bool );
    
                
    }
    public boolean largerThanOne(int num, int num1, int num2)
    {
        boolean n=((num>num1) || (num1>num2) || (num2<num));
         return n;

    }
    
}
