/*
 MCQScore

You have been given two char arrays as input, key and answersheet. The first input parameter is the key array 
and contains the correct answers of an examination, like {'a','b','d','c','b','d','c'}. The second input parameter 
is answersheet array and contains the answers that a student has given. You can assume that the student has answered 
all the questions. While scoring the examination, a correct answer gets +3 marks while an incorrect answer gets -1 marks.
Calculate the score of the student.
 */
package com.module3.array;

import java.util.Scanner;

public class MCQScore 
{
    public static void main(String[] args) 
    {
        MCQScore obj=new MCQScore();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number of Question : ");
        int a=input.nextInt();
        char[] ch1=new char[a];
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter key String:");
         String s1=sc.nextLine();
        
        for(int i=0; i<a; i++)
        {
           ch1[i]=s1.charAt(i); 
        }
        System.out.println("Enter Answer String: ");
        String s2=sc.nextLine();
        char [] ch2=new char[a];
        for(int j=0; j<a; j++)
        {
            ch2[j]=s2.charAt(j);
        }
        int result=obj.mcqScore(ch1, ch2);
        System.out.println("Total marks Obtained="+result);
        
        
    }
    public int mcqScore(char[] keys, char[] answersheet)
    {
        int len=keys.length;
        int totalAns=0;
        for(int i=0; i<len; i++)
        {
            if(keys[i]==answersheet[i])
                totalAns+=3;
            else
                totalAns-=1;
        }
        return totalAns;
    }
}
