/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;
import java.util.Scanner;
/**
 *
 * @author Welcome
 */
public class WordTo2DChar {
    public static void main(String[] args) {
       // WordTo2DChar obj=new WordTo2DChar();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String is : ");
        String words=input.nextLine();
        
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
                System.out.print(ch[i][j]);
                k++;
            }
        }
        //return ch;
    }
}
