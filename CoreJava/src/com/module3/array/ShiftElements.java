/*
 ShiftElements

Given a array of chars as input, return an array where the elements have been "left shifted" by one,
i.e. {'b','c','d','e'} becomes {'c','d','e','b'}. Note that you should not create a new array and only
modify the given input array.
 */
package com.module3.array;

import java.util.Scanner;

public class ShiftElements {
    public static void main(String[] args)
    {
        ShiftElements obj=new ShiftElements();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the array of element is : ");
        String str=input.nextLine();
        char [] arry=str.toCharArray();
        System.out.println("Enter the array of element is = { "+str+ "}");
        System.out.println("Shiting Array of element is = ");
        System.out.println("{");
        System.out.println(obj.shift(arry));
       /* char[] result=obj.shift(arry);
         for(int j=0; j<result.length; j++)
        {
            
            System.out.print(result[j]);
        }
      */
            System.out.println("\n }");

     }
       
    public char[] shift(char[] elements)
    {
        int len=elements.length;
        char ch=elements[0];
        if(len==1)
            return elements;
        for(int i=0; i<len-1; i++)
        {
            elements[i]=elements[i+1];
            
        }
        elements[len-1]=ch;
        return elements;
    }
    
}
