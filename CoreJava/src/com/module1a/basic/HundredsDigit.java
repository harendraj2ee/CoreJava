/*
 HundredsDigit

Given a 4 digit number as input, find the value of its hundreds digit.
 */
package com.module1a.basic;

public class HundredsDigit 
{
    public static void main(String[] args) 
    {
        HundredsDigit obj=new HundredsDigit();
        int result=obj.hundredsDigit(456896327);
        System.out.println(" 100 place digit number is : = " + result);
    }
    public int hundredsDigit(int num)
    {
        int a=num/100 ;
        
        
        return a%10;
    }
    
}
