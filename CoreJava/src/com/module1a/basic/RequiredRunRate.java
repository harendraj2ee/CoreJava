/*
 RequiredRunRate
A team is chasing the target set in a one day international match. The objective is to compute the required run rate.
* The following have provided as input: target, maxOvers, currentScore, oversBowled

 */
package com.module1a.basic;

public class RequiredRunRate 
{
    public static void main(String[] args) 
    {
        RequiredRunRate obj=new RequiredRunRate();
        double result=obj.runrateRequired(326,49,210,33);
        System.out.println("Run Rate Required is = "+ result);
        
    }
    public double runrateRequired(int target,int maxOvers, int currentScore, int oversBowled)
    {
        double remainOvers=maxOvers - oversBowled;
        double remainScore=target - currentScore;
        double totalrunrate=(remainScore/remainOvers);
        return totalrunrate;
        
    }
    
}
