/*
 1. Two Character strings may have many common substrings.

For example, photograph and tomography have several common substring of length one (i.e., single letters), 
and common substring ph, to, and ograph (as well as all the substrings of ograph). The maximum common substring length is 6.

    (a) WAP to find the maximum common substring from given two strings and also find maximum common substring length.
 */
package com.test.JobInterview;

import java.util.Scanner;

public class MaxSubString 
{
    public static void main(String[] args) 
    {
        MaxSubString obj=new MaxSubString();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st String is = ");
        String str1=input.nextLine();
        System.out.print("Enter the 2nd String is = ");
        String str2=input.nextLine();
        
        String result=obj.maxSubString(str1, str2);
        System.out.println("Common SubString is = "+result);
        System.out.println("Length of Common SubString is = "+result.length());
        
    }
    public String maxSubString(String str1, String str2)
    {
        int len1=str1.length();
        int len2=str2.length();
        int [][] arr=new int[len1+1][len2+1];
        int len=0;
        int pos=-1;
        for(int i=1; i<len1+1; i++)
        {
            for(int j=1; j<len2+1; j++)
            {
                if(str1.charAt(i-1)==str2.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1]+1;
                    if(arr[i][j]>len)
                    {
                        len=arr[i][j];
                        pos=i;
                    }
                }
                else
                    arr[i][j]=0;
            }
        }
        return str1.substring(pos-len, pos);
    }
    
}
