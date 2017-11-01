/*
 RemoveMultipleSpaces

Given a string as input, remove all the extra spaces that appear in it. Spaces wherever they 
appear should be a single space. Multiple spaces should be replaced by a single space.
 */
package com.module2.string;

import java.util.Scanner;

public class RemoveMultipleSpaces 
{
    public static void main(String[] args)
    {
        RemoveMultipleSpaces obj=new RemoveMultipleSpaces();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1=input.nextLine();
        String result=obj.removeMultSpac(str1);
        System.out.println("Remove multiple sapce String : "+result);
    }
    public String removeMultSpac(String sentence)
    {
        String str=sentence.replaceAll(" +", " ");
        return str;
    }
    
}
