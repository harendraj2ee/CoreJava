/*
 SecondToHours
 
Given the time in number of seconds, find out how many hours have been completed
 */
package com.module1a.basic;

public class SecondToHours 
{
    public static void main(String[] args)
    {
        SecondToHours obj=new SecondToHours();
        int result=obj.toHours(7700);
        System.out.println("Hours is : " +result);
    }
    public int toHours(int seconds)
    {
        int hours=3600; 
        return seconds/hours;
    }
}
