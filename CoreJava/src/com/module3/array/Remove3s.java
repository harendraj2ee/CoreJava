/*
 Remove3s
Given an array on numbers as input, remove all elements from the array which are either multiple
of 3 or have the digit 3 in them. For e.g. 13 and 15 will be both removed from the array if they are present.
 */
package com.module3.array;

import java.util.Scanner;

public class Remove3s 
{
    public static void main(String[] args) 
    {
        Remove3s obj=new Remove3s();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the arrays of size is : ");
        int num=input.nextInt();
        int[] arr1=new int[num];
        System.out.println("Enter the arrays of size is = {"+num+"}");
        System.out.println("{");
        for(int i=0; i<num; i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("}");
        int[] res=obj.remove(arr1);
        System.out.println("Remove of all mutiple of 3 & For e.g. 13 and 15 will be both removed from the array = ");
        System.out.println("{");
        for(int j=0; j<res.length; j++ )
        {
            System.out.println(res[j]);
        }
        System.out.println("}");
        
    }
    public int[] remove(int[] arr)
    {
        int len=arr.length;
        int j=0;
        for(int i=0; i<len; i++)
        {
            int a=arr[i]%10;
            int b=arr[i]/10;
            int c=b%10;
            if(arr[i]%3==0 || a==3 || c==3)
            {
                j++;
            }
        }
        int z=len-j;
        int[] result=new int[z];
        int d=0;
        for(int k=0; k<len; k++)
        {
            int p=arr[k]%10;
            int q=arr[k]/10;
            int r=q%10;
            if(arr[k]%3==0 || p==3 || r==3)
            {
                
            }
            else
            {
                result[d]=arr[k];
                d++;
            }
        }
        return result;
    }
    
}
