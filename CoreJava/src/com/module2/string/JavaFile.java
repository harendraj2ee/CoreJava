/*
 JavaFile

A file name in java ends in .java. Given the name of the file, return true if its a java file, else return false
 */
package com.module2.string;

import java.util.Scanner;

public class JavaFile 
{
    public static void main(String[] args)
    {
     JavaFile obj=new JavaFile();
     Scanner input=new Scanner(System.in);
        System.out.print("Enter File Name with extension : ");
        String str1=input.nextLine();
        boolean result=obj.isJavaFile(str1);
        System.out.println("File is : "+result);
    }
    public boolean isJavaFile(String str)
    {
        int len=str.length();
       String ch=new String(".java");
       String ch1=new String(str.substring(len-5,len));
       if(ch1.equals(ch))
       return true;
       else
        return false;
    
       
        
    }
    
}
