/*
 ConcatAsPattern

Given 2 strings str1 and str2 as input, return a string of the form (str1)str2(/str1)
 */
package com.module2.string;

import java.util.Scanner;


public class ConcatAsPattern 
{
    public static void main(String[] args)
    {
        ConcatAsPattern obj = new ConcatAsPattern();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String a=input.nextLine();
        System.out.print("Enter 2nd String : ");
        String b=input.nextLine();
        String result=obj.makePattern(a, b);
        System.out.println("String form is : "+result);
        
    }
    public String makePattern(String str1, String str2)
    {
        String res="("+str1+")"+str2+"(/"+str2+")";
        return res;
    }
    
}
