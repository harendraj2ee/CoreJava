/*
 otteryPrize

Jack bought a lottery ticket. He will get a reward based on the number of the lottery ticket. 
The rules are as follows - If the ticket number is divisible by 4, he gets 6 - If the ticket number is divisible
by 7, he gets 10 - If the ticket number is divisible by both 4 and 7, he gets 20 - Otherwise, he gets 0. 
Given the number of the lottery ticket as input, compute the reward he will receive
 */
package com.module1b.basic2;

import java.util.Scanner;

public class LotteryPrize 
{
    public static void main(String[] args) 
    {
        LotteryPrize obj=new LotteryPrize();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number is = ");
        int a=input.nextInt();
        int result=obj.lotteryReward(a);
        System.out.println("Result is = "+result);
        
    }
    public int lotteryReward(int ticketNumber)
    {
        if(ticketNumber%4==0 && ticketNumber%7!=0 )
		return 6;
		else if(ticketNumber%7==0 && ticketNumber%4!=0)
		return 10;
		else if (ticketNumber%4==0 && ticketNumber%7==0)
		return 20;
		else 
		return 0;
		
    }
    
}
