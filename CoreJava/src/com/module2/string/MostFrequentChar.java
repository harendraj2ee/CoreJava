/*
 MostFrequentChar

Given a string as input, return the char which occurs the maximum number of times in the string. 
You can assume that only 1 char will appear the maximum number of times.
 */
package com.module2.string;

import java.util.Scanner;

public class MostFrequentChar 
{
    public static void main(String[] args)
    {
        MostFrequentChar obj=new MostFrequentChar();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1=input.nextLine();
        char result=obj.mostCharacter(str1);
        System.out.println("Maximum times of character : "+result);
        
    }
    public char mostCharacter(String str)
    {
        char[] array = str.toCharArray();
    int maxCount = 1;
    char maxChar = array[0];
    for(int i = 0, j = 0; i < str.length() - 1; i = j){
        int count = 1;
        while (++j < str.length() && array[i] == array[j]) {
            count++;
        }
        if (count > maxCount) {
            maxCount = count;
            maxChar = array[i];
        }
    }
    return maxChar;
    }
}
