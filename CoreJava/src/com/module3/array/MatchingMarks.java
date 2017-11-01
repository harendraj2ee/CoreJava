/*
 MatchingMarks

You have been given the scores of two students in different subjects. Count the number of times the difference in their marks 
for the same subject is less than 10.
 */
package com.module3.array;

import java.util.Scanner;


public class MatchingMarks 
{
    public static void main(String[] args) 
    {
        MatchingMarks obj=new MatchingMarks();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st array of size  is : ");
        int num1=input.nextInt();
        int arr1[]=new int[num1];
        System.out.println("First  Arrays of Size is = {"+num1+"}:");
        
        for(int i=0; i<num1 ; i++)
        {
            System.out.print("Enter the 1st array of element is : ");
            arr1[i]=input.nextInt();
        }
        
         System.out.print("Enter the 2nd array of size  is : ");
        int num2=input.nextInt();
        int arr2[]=new int[num2];
        
        System.out.println("Second Arrays of Size is = {"+num2+"}:");
        
        for(int j=0; j<num2; j++)
        {
            System.out.print("Enter the 2nd array of element is : ");
            arr2[j]=input.nextInt();
        }
        int result=obj.countMatching(arr1, arr2);
        System.out.println("Count of  differenc of less then 10 number is = "+result );
    }
    public int countMatching(int marks1[], int marks2[])
    {
        int count=0;
        int len=marks1.length;
        for(int i=0; i<len; i++)
        {
            int diff=marks1[i]-marks2[i];
            if(diff<10 && diff>-10)
                count++;
        }
        return count;
    }
    
}
