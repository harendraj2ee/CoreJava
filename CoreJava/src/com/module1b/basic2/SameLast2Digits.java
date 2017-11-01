/*
 SameLast2Digits

You have been given 4 numbers as input. Return true if any one the numbers has the same last 2 digits. 
For e.g. 123455 has the same last 2 digits (5 and 5) whereas 123545 does not (4 and 5). In this problem,
define a function that check whether a number has the same two digits or not and returns true or false. 
Use that function to calculate for the 4 numbers
 */
package com.module1b.basic2;

import java.util.Scanner;

public class SameLast2Digits 
{
    public static void main(String[] args)
    {
        SameLast2Digits obj=new SameLast2Digits();
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a 1st number is = ");
        int a1=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int a2=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int a3=input.nextInt();
        System.out.print("Enter a 4th number is = ");
        int a4=input.nextInt();
        
        boolean result=obj.isSameLastDigit(a1, a2, a3, a4);
        System.out.println("Result is = "+result);
        
    }
    public boolean isSameLastDigit(int num1,int num2,int num3,int num4)
    {
        boolean a=checkLast2Digit(num1);
        boolean b=checkLast2Digit(num2);
        boolean c=checkLast2Digit(num3);
        boolean d=checkLast2Digit(num4);
        
        if(a|b|c|d==true)
            return true;
        else 
            return false;
    }
    public boolean checkLast2Digit(int num)
    {
        int n1,n2;
        n1=num%10;
        n2=(num/10)%10;
        if(n1==n2)
            return true;
        else
            return false;
        
    }
    
}
