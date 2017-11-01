/*AddTwoNums

Given two numbers as input, calculate the sum of the numbers.

 */
package com.module1a.basic;

public class AddTwoNums 
{
    public static void main(String[] args) 
    {
        AddTwoNums obj=new AddTwoNums();
        int result=obj.add(40,80);
        System.out.println("Result = " +result);
    }
    public int add(int num1, int num2)
    {
        int sum=num1+num2;
        return sum;
        
    }    
}
