/*
 Blackjack

Given 2 int values greater than 0, return whichever value is nearest to 21 without being greater than 21. 
Return -1 if the values are greater than 21. Also return -2 if both the values are same and less or equal to 21.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class Blackjack 
{
    public static void main(String[] args) 
    {
        Blackjack obj=new Blackjack();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int b=input.nextInt();
        int result=obj.calculateBlackjack(a, b);
        System.out.println("Result is = "+result);
        
        
    }
    public int calculateBlackjack(int num1, int num2)
    {
       	if(num1<=21 && num2<=21)
        {
          if(num1>num2 && num1!=num2)
            return num1;
        if(num2>num1 && num1!=num2)
            return num2;
  if((num1==num2) || (num1<21 && num2<21) || (num1==21 && num2==21))
            return -2;      
        }
        else if(num1>21 && num2>21)
        {
            return -1;
        }
else if((num1<21 && num2>21) || (num2<21 && num1>21))
        {
            if(num1<num2)
            return num1;
        else
            return num2;
        }
        return 0;

    }
    
}
