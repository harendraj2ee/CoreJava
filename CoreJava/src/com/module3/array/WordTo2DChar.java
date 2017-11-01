/*
WordTo2DChar
Given a para of words (separated by space), create a 2D array where each array 
in it represents the word. Note that the words are of the same size.
 */
package com.module3.array;

import java.util.Scanner;

public class WordTo2DChar
{
    public static void main(String[] args)
    {
        WordTo2DChar obj=new WordTo2DChar();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String is : ");
        String str=input.nextLine();
       char[][] result=obj.to2DChars(str);
       
       System.out.print("Seperate space of each character is : {");
       // System.out.println(result.length);
        //System.out.println(result[0].length);
     for(int row=0; row<result.length; row++)
     {
         System.out.print("{");
         for(int col=0; col<result[0].length; col++)
         {
             
             System.out.print("'"+result[row][col]);
             if(col!=result[0].length-1)
             {System.out.print("',");}
             else
             {System.out.print("'");}
         }
         if(row!=result.length-1)
         { System.out.print("};");}
         else
         {System.out.print("}");}
     }
       // System.out.println(result[0][4]);
       System.out.print("}");
       
    }
    public char[][] to2DChars(String words)
    {
        int row=0;
        int index=words.indexOf(' ');
        int col=index;
        if(index==-1)
        {
           col=words.length();
        }
        while(index!=-1)
        {
            row++;
            index=words.indexOf(' ', index+1);
        }
        row++;
        char[][] ch=new char[row][col];
        int k=0;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ch[i][j]=words.charAt(i+k);
                k++;
            }
        }
        return ch;
    }
    
}
