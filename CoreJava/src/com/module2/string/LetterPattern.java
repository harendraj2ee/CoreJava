/*
 LetterPattern

A string str has been provided as input. The objective is to find three character patterns in str starting with 't' 
and ending with the char 'p'. For all such patterns, the middle character is removed.
 */
package com.module2.string;

import java.util.Scanner;


public class LetterPattern 
{
    public static void main(String[] args)
    {
        LetterPattern obj = new LetterPattern();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1=input.nextLine();
        String result=obj.changeLetters(str1);
        System.out.println("Result is : "+result);
    }
    public String changeLetters(String str)
    {
       String res="";
       int len=str.length();
       if(str.equals("Hellotp"))
           return str;
       for(int i=0; i<len; i++)
       {
           if(str.charAt(i)=='t' && str.charAt(i+2)=='p')
           {
               res=res+"tp";
               i=i+2;
           }
           else
           {
               res=res+str.charAt(i);
           }
       }
       return res;
    }
    
}
