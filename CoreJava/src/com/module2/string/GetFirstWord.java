/*
GetFirstWord

Given a sentence as an input, return the first word of the sentence. Note that words 
in a sentence have the char space or ' ' between them.
 */
package com.module2.string;

import java.util.Scanner;


public class GetFirstWord 
{
    public static void main(String[] args) 
    {
        GetFirstWord obj=new GetFirstWord();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String str2=input.nextLine();
        String result=obj.firstWord(str2);
        System.out.println("First String is : "+result);
        
    }
    public String firstWord(String sentence)
    {
        String str1=" ";
        for(int i=0; i<sentence.length(); i++)
        {
            char ch=sentence.charAt(i);
            if(ch==' ')
            return str1;
            //else
            str1=str1+ch;
        }
        return str1;
    }
    
}
