/*
 CountCharInString

Given a string and a char as input, output the number of times, the char appears in the string.
 */
package com.module2.string;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class CountCharInString 
{
    public static void main(String[] args) 
    {
        //BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        
        CountCharInString obj=new CountCharInString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Word is = ");
        String name=input.nextLine();
        System.out.print("Enter one Char : ");
        String ch2= input.nextLine();
        char ch1 =ch2.charAt(0);
        
        int result=obj.countCharacter(name, ch1);
        System.out.println("Character count is = "+result);
        
    }
    public int countCharacter(String word, char ch)
    {
        int len=word.length();
        int count=0;
        for(int i=0; i<len; i++)
        {
            if(ch==word.charAt(i))
                count++;
            
        }
        return count;
    }
    
}
