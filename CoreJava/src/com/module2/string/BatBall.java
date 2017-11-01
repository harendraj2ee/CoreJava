/*
 BatBall

Given a string, return true if the string "bat" and "ball" appear the same number of times.
 */
package com.module2.string;

import java.util.Scanner;


public class BatBall 
{
    public static void main(String[] args)
    {
        BatBall obj=new BatBall();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1=input.nextLine();
        boolean result=obj.equal(str1);
        System.out.println("bat and ball are same no times or not : "+result);
    }
    public boolean  equal(String str)
    {
        int index1=str.indexOf("bat");
        int index2=str.indexOf("ball");
        int count1=0;
        int count2=0;
        while(index1!=-1)
        {
            index1=str.indexOf("bat", index1+1);
            count1++;
        }
        while(index2!=-1)
        {
            index2=str.indexOf("ball", index2+1);
            count2++;
        }
        if(count1==count2)
            return true;
        else
            return false;
    }
    
}
