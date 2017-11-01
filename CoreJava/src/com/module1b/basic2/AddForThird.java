/*
 AddForThird

Given three numbers a, b and c, return true if the sum of any two equals the third number.
 */
package com.module1b.basic2;

import java.util.Scanner;


public class AddForThird
{
    public static void main(String[] args) 
    {
       AddForThird obj=new AddForThird();
       Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
       int num1=input.nextInt();
       System.out.print("Enter a 2nd number is = ");
       int num2=input.nextInt();
       System.out.print("Enter a 3rd number is = ");
       int num3=input.nextInt();
       boolean result=obj.addThird(num1, num2, num3);
        System.out.println("Result is = "+result);
    }
    public boolean addThird(int a, int b, int c)
    {
        int sum1=0,sum2=0,sum3=0;
        sum1=a+b;
        sum2=b+c;
        sum3=c+a;
        if(sum1==c || sum2==a || sum3==b)
            return true;
        else
            return false;
                    
        
    }
    
}
