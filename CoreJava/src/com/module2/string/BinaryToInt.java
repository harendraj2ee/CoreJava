/*
 BinToInt

Given a binary number as input convert it into base 10 (decimal system). Note that to convert a number 100111 
from binary to decimal, the value is 1*2^5 + 0*2^4 + 0*2^3 + 1*2^2 + 1*2^1+ 1*2^0. Also note that 5 here is the length of the binary number – 1.
 */
package com.module2.string;

import java.util.Scanner;

public class BinaryToInt 
{
    public static void main(String[] args)
    {
        BinaryToInt obj=new BinaryToInt();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter binary number is : ");
        String str=input.nextLine();
        int result=obj.convert(str);
        System.out.println("Convert binary no. to Decimal system : "+result);
        
    }
    public int convert(String binary)
    {
        long num=Long.parseLong(binary);
        int len=binary.length();
        int sum=0;
        for(int i=0; i<len; i++)
        {
            long rem=num%10;
            double digit=rem*(Math.pow(2, i));
            sum=sum+(int)digit;
            num=num/10;
        }
        return sum;
    }
    
}
