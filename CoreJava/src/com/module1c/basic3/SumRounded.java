/*
 SumRounded

Round a number to the next multiple of 10 if its ones digit is 5 or more, otherwise round it the previous multiple of 10.
So, 25 and 26 round to 30 where as 23 and 24 round to 20. 20 also rounds to 20. You have been given 4 ints as input. 
Round each of the input values and return their sum.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class SumRounded 
{
    public static void main(String[] args)
    {
        SumRounded obj=new SumRounded();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int b=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int c=input.nextInt();
        System.out.print("Enter a 4th number is = ");
        int d=input.nextInt();
        int result=obj.sumRounded(a, b, c, d);
        System.out.println("Sum of Rounded number is = "+result);
        
    }
    public int sumRounded(int num1, int num2, int num3, int num4)
    {
        int n1=roundedNum(num1);
        int n2=roundedNum(num2);
        int n3=roundedNum(num3);
        int n4=roundedNum(num4);
        return n1+n2+n3+n4;
        
    }
    public int roundedNum(int num)
    {
        int rem=num%10;
        num=num/10;
        if(rem>=0 && rem<5)
            return num*10;
        else
            return num*10+10;
    }
    
}
