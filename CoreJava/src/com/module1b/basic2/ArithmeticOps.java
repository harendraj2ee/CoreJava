/*
 ArithmeticOps

Two numbers a and b and a char c have been provided as inputs. The char c represents a mathematical 
operation namely +,-,*,/,% (remainder). The task is to perform the correct operation on a and b as specified by the char c.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class ArithmeticOps
{
    public static void main(String[] args)
    {
        ArithmeticOps obj=new ArithmeticOps();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st element is = ");
        int num1=input.nextInt();
        System.out.print("Enter 1st element is = ");
        int num2=input.nextInt();
        
        System.out.print("Which Arithmeic operation perform = ");
        char oper=input.next().charAt(0);
        int result=obj.compute(num1, num2, oper);
        System.out.println("Result  is = " +result);
        
                
        
    }
    public int compute(int a, int b, char operator)
    {
        switch(operator)
        {
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;
            case '%': return a%b;
            default :
                return 0;
        }
    }
    
}
