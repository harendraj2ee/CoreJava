/*
 LotteryTicket
Problem Statement

You have purchased a lottery ticket showing 3 digits a, b, and c. The digits can be 0, 1, or 2. 
If they all have the value 2, the result is 10. Otherwise if they are all the same, the result is 5. 
Otherwise if both b and c are different from a, the result is 1. Otherwise the result is 0.
 */
package com.module1b.basic2;

import java.util.Scanner;


public class LotteryTicket
{
    public static void main(String[] args)
    {
        LotteryTicket obj=new LotteryTicket();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a1=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int a2=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int a3=input.nextInt();
        int result=obj.lotteryTicket(a1, a2, a3);
        System.out.println("Result is = "+result);
        
        
    }
    public int lotteryTicket(int a, int b, int c)
    {
        if(a==2 && b==2 && c==2)
            return 10;
        else if(a==b && b==c && c==a && a!=2)
            return 5;
        else if(a!=b && a!=c)
            return 1;
        else
            return 0;
        
        
    }
    
}
