/*
 ChangeStringCase

Given a string as input, the expected output is a string where the case of all alphabets has been changed.
 */
package com.module2.string;

import java.util.Scanner;


public class ChangeStringCase 
{
    public static void main(String[] args) 
    {
        ChangeStringCase obj=new ChangeStringCase();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String ");
        String str1=input.nextLine();
        String result=obj.changeCase(str1);
        System.out.println("Change String is : "+result);
        
        
    }
    public String changeCase(String sentence)
    {
       /* 1st Method program 
        char chars[]=sentence.toCharArray();
        for(int i=0; i<chars.length; i++)
        {
            char ch=chars[i];
            if(Character.isUpperCase(ch))
            {
                chars[i] =Character.toLowerCase(ch); 
            }
            else if(Character.isLowerCase(ch))
            {
                chars[i]=Character.toUpperCase(ch);
            }
        }
        return new String(chars); */
        
        /* 2nd Method program
        int len=sentence.length();
        String res="";
        for(int i=0; i<len; i++)
        {
            char ch=sentence.charAt(i);
            if(Character.isUpperCase(ch))
            {
                res+=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                res+=Character.toUpperCase(ch);
            }
            else
            {
                res+=ch;
            }
        }
        return res; */
        
        int len=sentence.length();
        String res="";
        for(int i=0; i<len; i++)
        {
            char ch=sentence.charAt(i);
            if(ch>='A'&& ch<='Z')
            {
                res+=(char)(ch+32);
            }
            else if(ch>='a' && ch<='z')
            {
                res+=(char)(ch-32);
            }
            else
            {
                res+=ch;
            }
        }
        return res;
    }
    
}
