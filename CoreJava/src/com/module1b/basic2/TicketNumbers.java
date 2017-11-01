/*
 TicketNumbers

You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,
the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class TicketNumbers 
{
    public static void main(String[] args) 
    {
        TicketNumbers obj=new TicketNumbers();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is = ");
        int a1=input.nextInt();
        System.out.print("Enter a 2nd number is = ");
        int a2=input.nextInt();
        System.out.print("Enter a 3rd number is = ");
        int a3=input.nextInt();
        int result=obj.calcuPrize(a1, a2, a3);
        System.out.println("Result is = "+result);
        
    }
    public int calcuPrize(int a, int b, int c)
    {
        if(a!=b && b!=c && c!=a)
            return 0;
        else if(a==b && b==c && c==a)
            return 20;
        else
            return 10;
    }
    
}
