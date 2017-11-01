/*
 MakeDecimal
Given 3 digits a,b and c as input, return a double of the form a.bc

 */
package com.module1a.basic;

public class MakeDecimal 
{
    public static void main(String[] args) 
    {
        MakeDecimal obj=new MakeDecimal();
        double result=obj.makeDecimal(4,8,1);
        System.out.println("Make 3 digit number is = " +result);
        
        double result1=obj.makeDecimal(0, 0, 6);
        System.out.println("Make 3 digit number is another result = " +result1);
        
    }
    public double makeDecimal(int a, int b, int c)
    {
        double mkDecimal=((a*100)+(b*10)+(c*1))/100.0;
        return mkDecimal;
    }
    
}
