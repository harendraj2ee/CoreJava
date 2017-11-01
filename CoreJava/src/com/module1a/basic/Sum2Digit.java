/*
 Sum2Digit

Given a 2 digit number as input, compute the sum of its digits. Assume that the number has 2 digits.
 */
package com.module1a.basic;


public class Sum2Digit 
{
    public static void main(String[] args) 
    {
        Sum2Digit obj=new Sum2Digit();
        int result=obj.sumTwoDigit(68);
        System.out.println("Sum of two digit no is = " +result);
        
        int result1=obj.sumTwoDigit(10);
        System.out.println("sum of two digit no is = " +result1);
        int result2=obj.sumTwoDigit(13);
        System.out.println("sum of two digit no is = " +result2);
        int result3=obj.sumTwoDigit(19);
        System.out.println("sum of two digit no is = " +result3);
        int result4=obj.sumTwoDigit(67);
        System.out.println("sum of two digit no is = " +result4);
        
    }
    public int sumTwoDigit(int n)
    {
        int digit=0;
        digit=n/10+n%10;
        return digit;
        
    }
    
}
