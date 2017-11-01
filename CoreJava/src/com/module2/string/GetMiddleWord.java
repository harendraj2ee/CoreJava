/*
 GetMiddleWord

Given 3 words w1,w2 and w3 as input, output the word that will come in between in a dictionary.
 */
package com.module2.string;

import java.util.Scanner;

public class GetMiddleWord 
{
    public static void main(String[] args)
    {
        GetMiddleWord obj=new GetMiddleWord();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st Word : ");
        String str1=input.nextLine();
        System.out.print("Enter 2nd Word : ");
        String str2=input.nextLine();
        System.out.print("Enter 3rd Word : ");
        String str3=input.nextLine();
        String result=obj.middleWord(str1, str2, str3);
        System.out.println("Middle Word is : "+result);
        
    }
    public String middleWord(String word1, String word2, String word3)
    {
        if((word1.compareToIgnoreCase(word2)>=0 && word2.compareToIgnoreCase(word3)>=0) ||
                (word1.compareToIgnoreCase(word2)<=0 && word2.compareToIgnoreCase(word3)<=0))
        return word2;
        else if ((word2.compareToIgnoreCase(word3)>=0 && word3.compareToIgnoreCase(word1)>=0) ||
                (word2.compareToIgnoreCase(word3)<=0 && word3.compareToIgnoreCase(word1)<=0))
            return word3;
        else
            return word1;
        
    }
    
}
