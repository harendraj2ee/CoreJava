/*
StringToNumber

Given a string as input, convert it into the number it represents. You can assume that the string consists of 
only numeric digits. It will not consist of negative numbers. Do not use Integer.parseInt to solve this problem.
 */
package com.module2.string;

import java.util.Scanner;

public class StringToNumber 
{
    public static void main(String[] args)
    {
        StringToNumber obj=new StringToNumber();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String as a numeric type : ");
        String str1=input.nextLine();
        int result=obj.toNumber(str1);
        System.out.println("Result is : "+result);
    }
    public int toNumber(String str)
    {
        int num=Integer.parseInt(str);
        return num;
    }
    
}
