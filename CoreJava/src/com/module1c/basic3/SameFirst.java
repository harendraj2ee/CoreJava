/*
SameFirst

Given three numbers as input, return true if the first digit of any two of them is the same. 
The first digit of 2345 is 2, of 981201 is 9. Assume all the numbers are positive integers greater than 0.
For solving this problem, define a function that computes the first digit if a number and use that function.
 */
package com.module1c.basic3;

import java.util.Scanner;

public class SameFirst
{
    public static void main(String[] args) 
    {
        SameFirst obj=new SameFirst();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int b=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int c=input.nextInt();
        boolean result=obj.sameFirstDigit(a, b, c);
        System.out.println("First number occure 2nd number or 3rd number = "+result);
        
    }
    public boolean sameFirstDigit(int num1, int num2, int num3)
    {
        int x=findDigit(num1);
        int y=findDigit(num2);
        int z=findDigit(num3);
        if(x==y || y==z || z==x)
            return true;
        else
            return false;
        
    }
    public int findDigit(int num)
    {
        int temp=0,rem=0;
        while(num>0)
        {
            rem=num%10;
            temp=rem;
            num=num/10;
            
        }
        return temp;
    }
    
}
