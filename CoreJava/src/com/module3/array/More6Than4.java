/*
 More6Than4

Given an array of ints as input, return true if the number of 6's (sixes) is greater than the number of 4's (fours).
 */
package com.module3.array;

import java.util.Scanner;

public class More6Than4
{
    public static void main(String[] args)
    {
        More6Than4 obj=new More6Than4();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter array of an size is : ");
        int num=input.nextInt();
        int arr[]=new int[num];
        System.out.print("Element of size of an array is - "+num +" :");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("}");
        boolean result=obj.count6And4(arr);
        System.out.println("Total no. of 6 is more than 4 is true or false : "+result);
        
    }
    public boolean count6And4(int [] numbers)
    {
        int count6=0;
        int count4=0;
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==6)
                count6++;
            if(numbers[i]==4)
                count4++;
        }
        if(count6>count4)
            return true;
        else 
            return false;
    }
    
}
