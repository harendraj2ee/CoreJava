/*
 DaysInMonth

Given the number of the month in 2013 (1 for January, 12 for December), return the number of days in it.
 */
package com.module1b.basic2;

import java.util.Scanner;


public class DaysInMonth
{
    public static void main(String[] args)
    {
        DaysInMonth obj=new DaysInMonth();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a month in number is  = ");
        int a=input.nextInt();
        int result=obj.numOfDays(a);
        System.out.println("Month of days is = "+result);
        
    }
    public int numOfDays(int month)
    {
        switch(month)
		{
		case 1: return 31;
		case 2: return 28;
		case 3: return 31;
		case 4: return 30;
		case 5: return 31;
		case 6: return 30;
		case 7: return 31;
		case 8: return 31;
		case 9: return 30;
		case 10: return 31;
		case 11: return 30;
		case 12: return 31;
		default:
		return 0;
		}

    }
}
