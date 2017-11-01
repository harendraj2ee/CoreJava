/*
 RunsInSeries
 * 
The scores of a batsman in the five matches of a one day international series have been provided. 
 Calculate the total number of runs the batsman scored in the series.
 */
package com.module1a.basic;

public class RunsInSeries
{
    public static void main(String[] args)
    {
       RunsInSeries bat=new RunsInSeries(); 
       int result=bat.runScore(95,105,85,115,100);
        System.out.println("Batsman Score is = " +result);
    }
    public int runScore(int num1, int num2, int num3, int num4, int num5)
    {
        int totalRun=num1+num2+num3+num4+num5;
        return totalRun;
    }
    
}
