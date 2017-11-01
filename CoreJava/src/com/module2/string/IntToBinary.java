/*
 IntToBin

Given a number in base 10 (decimal system) as input convert it into binary (base 2). 
Note that to convert a number from base 10 to base 2, keep on dividing it by 2 and appending 
the remainder to start of the binary number. For e.g. to convert 12 into binary, 
Step 1 : divide 12 by 2, quotient = 6, remainder = 0, output = "0" Step 2 : divide 6 by 2, quotient = 3, 
remainder = 0, output = "00" Step 3 : divide 3 by 2, quotient = 1, remainder = 1, output = "100" 
Step 4 : divide 1 by 2, quotient = 0, remainder = 1, output = "1100" As quotient = 0 at step 4, 
we stop and the binary representation of 12 is 1100.
 */
package com.module2.string;

import java.util.Scanner;

public class IntToBinary 
{
    public static void main(String[] args) 
    {
        IntToBinary obj = new IntToBinary();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number : ");
        int a=input.nextInt();
        String result=obj.convert(a);
        System.out.println("Convert Decimal no. System to binary system is : "+result);
        
    }
    public String convert(int num)
    {
        String str="";
        if(num==0)
            return "0";
        while(num>0)
        {
            int rem=num%2;
            str=rem+str;
            num=num/2;
        }
        return str;
    }
    
}
