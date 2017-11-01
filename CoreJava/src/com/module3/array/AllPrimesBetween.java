/*
 AllPrimesBetween
Given two numbers n1 and n2 as input, return an array containing all the primes between n1 and n2 
(Note that both n1 and n2 can be included in the array if they are prime). Also, the primes in the
array need to be in ascending order.
 */
package com.module3.array;

import java.util.Scanner;

public class AllPrimesBetween 
{
    public static void main(String[] args) 
    {
        AllPrimesBetween obj=new AllPrimesBetween();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the 1st number is : ");
        int num1=input.nextInt();
        System.out.print("Enter the 2nd number is : ");
        int num2=input.nextInt();
        int[] result=obj.getPriems(num1, num2);
        System.out.print("All Prime Number is Ascending Order is : {");
        for(int i=0; i<result.length; i++)
        {
            System.out.print(result[i]+" ");
        }
        System.out.print("}");
    }
    public int[] getPriems(int start, int stop)
    {
          int count=0;
    
    for(int i=start; i<=stop; i++)
          {
              if(isPrime(i))
              {
                  
              count++;
              }
          }
          int[] result=new int[count];
          int j=0;
          for(int i=start; i<=stop; i++)
          {
              if(isPrime(i))
              {
                result[j]=i  ;
              j++;
              }
          }
          
     
    return result;
      
   }
   public boolean isPrime(int num){
		if(num>1)
		{
		for(int i=2; i<=num/2; i++)
		{
		    if(num%i==0)
		    return false;
		   
		    
		}
		return true;
        }
        return false;
    }
    
}
