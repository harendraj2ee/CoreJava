/*
 SecondsToTime

Given the time of a day in number of seconds, convert it into time in hhmmss format. 
Note that the time is past noon, and hence the hours will never be less than 12.
 */
package com.module1a.basic;

public class SecondsToTime 
{
    public static void main(String[] args) 
    {
        SecondsToTime obj=new SecondsToTime();
        int result=obj.secondTotime(86399);
        System.out.println(" Time is hours minutes & seconds is = " +result);
        int result1=obj.secondTotime(46800);
        System.out.println(" Time is hours minutes & seconds is = " +result1);
        int result2=obj.secondTotime(55845);
        System.out.println(" Time is hours minutes & seconds is = " +result2);
        int result3=obj.secondTotime(36000);
        System.out.println(" Time is hours minutes & seconds is = " +result3);
    }
    public int secondTotime(int seconds)
    {
        int numWorks=seconds/60;
        int sec= seconds%60;
        int hours=numWorks/60;
        int min=numWorks%60;
        int totalTime=hours*10000+min*100+sec;
        return totalTime;
          
        
    }
    
}
