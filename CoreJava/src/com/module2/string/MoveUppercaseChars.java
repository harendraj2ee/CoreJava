/*
 MoveUppercaseChars

Given a string as input, move all the alphabets in uppercase to the end of the string.
 */
package com.module2.string;

import java.util.Scanner;


public class MoveUppercaseChars 
{
    public static void main(String[] args) 
    {
        MoveUppercaseChars obj = new MoveUppercaseChars();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1=input.nextLine();
        String result=obj.move(str1);
        System.out.println("Original String move to capital letter end is : "+result);
        
    }
    public String move(String str)
    {
        String cap="";
        String low="";
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                cap=cap+ch;
            }
            else
            {
                low=low+ch;
            }
        }
        return low+cap;
    }
    
}
