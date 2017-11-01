/*
 ChangeCharCase

Given a char as input, if it is an alphabet change its case otherwise return it as it is.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class ChangeCharCase
{
    public static void main(String[] args) 
    {
        ChangeCharCase obj=new ChangeCharCase();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character & number function key = ");
        char ch1=input.next().charAt(0);
        char result=obj.changeCase(ch1);
        System.out.println("Result is = " +result);
                
        
    }
    public char changeCase(char ch)
            
    {
        if(ch>='A' && ch<='Z')
            ch+=32;
        else if(ch>='a' && ch<='z')
            ch-=32;
        return ch;
            
    }
    
}
