/*
 LotteryPrize3
Problem Statement

Jack bought 3 lottery tickets. He will get a reward based on the number of the lottery ticket. The rules are as follows - If 
the ticket number is divisible by 4, he gets 6 - If the ticket number is divisible by 7, he gets 10 - If the ticket number is 
divisible by both 4 and 7, he gets 20 - Otherwise, he gets 0. Given the numbers of the 3 lottery tickets as input, 
compute the total reward he will receive. In this problem define a function to compute the reward given the ticket number and 
use that function to calculate the total reward.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class LotteryPrize3 
{
    public static void main(String[] args)
    {
        LotteryPrize3 obj=new LotteryPrize3();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st nubmer is = ");
        int a=input.nextInt();
        System.out.print("Enter a 2nd nubmer is = ");
        int b=input.nextInt();
        System.out.print("Enter a 3rd nubmer is = ");
        int c=input.nextInt();
        int result=obj.lotteryTicketfor3(a, b, c);
        
        System.out.println("Result is = "+result);    
        
    }
    
    public int lotteryTicketfor3(int ticketNumber1, int ticketNumber2, int ticketNumber3)
    {
        int num1, num2, num3;
        num1=totalReward(ticketNumber1);
        num2=totalReward(ticketNumber2);
        num3=totalReward(ticketNumber3);
        int sum=num1+num2+num3;
        return sum;
    }
    
    public int totalReward(int n)
    {
        if(n%4==0 && n%7!=0)
            return 6;
        else if(n%7==0 && n%4!=0)
            return 10;
        else if(n%7==0 && n%4==0)
            return 20;
        else
            return 0;
        
    }    
}
