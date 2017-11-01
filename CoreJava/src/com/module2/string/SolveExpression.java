/*
 SolveExpression

Given a string representing a simple arithmetic expression, solve it and return its integer value. 
The expression consists of two numbers with a + or – operator between the numbers, i.e., it will of the form x+y or x-y where x and y are not negative.
 */
package com.module2.string;

import java.util.Scanner;

public class SolveExpression 
{
    public static void main(String[] args)
    {
        SolveExpression obj=new SolveExpression();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number add(+) or subtract(-)  : ");
        String str1=input.nextLine();
        int res=obj.solve(str1);
        System.out.println("Result is :"+res);
        
    }
    public int solve(String str)
    {
        int len=str.length();
        int result=0;
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i)=='+')
            {
                int first=Integer.parseInt(str.substring(0, i));
                int last=Integer.parseInt(str.substring(i+1, len));
                result=first+last;
            }
            else if(str.charAt(i)=='-')
            {
                int first=Integer.parseInt(str.substring(0, i));
                int last=Integer.parseInt(str.substring(i+1, len));
                result=first-last;
            }
        }
        return result;
    }
    
}
