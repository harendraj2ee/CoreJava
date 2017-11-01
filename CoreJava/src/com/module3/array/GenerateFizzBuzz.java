/*
 GenerateFizzBuzz

You have been two ints, n1 and n2 as input. Return a new String[] containing the numbers from n1 to n2 as strings, 
except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
 */
package com.module3.array;

import java.util.Scanner;

public class GenerateFizzBuzz
{
    public static void main(String[] args) 
    {
        GenerateFizzBuzz obj=new GenerateFizzBuzz();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Starting number is : ");
        int num1=input.nextInt();
        System.out.print("Enter Stoping number is : ");
        int num2=input.nextInt();
        String[] res=obj.generate(num1, num2);
        System.out.print("Result is = ");
        System.out.print("{");
        for(int j=0; j<res.length; j++)
        {
            System.out.print(res[j]+",");
        }
        System.out.print("}");
    }
    public String[] generate(int start, int stop)
    {
        int len=(stop-start)+1;
        String[] result=new String[len];
        int k=0;
        for(int i=start; i<=stop; i++)
        {
            if(i%3==0 && i%5==0)
                result[k]="FizzBuzz";
            else if(i%3==0)
                result[k]="Fizz";
            else if(i%5==0)
                result[k]="Buzz";
            else
                result[k]=""+i;
            k++;
        }
        return result;
    }
    
}
