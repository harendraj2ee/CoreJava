/*
 Enter a Number is : 8
print like this : 
        *
       *
      *
     *
    *
   *
  *
 *
 *
  *
   *
    *
     *
      *
       *
        *
 */
package com.harry.star;
import java.util.Scanner;
public class StarPrint5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number is : ");
        int n=sc.nextInt();
        System.out.println("print like this : ");
       
        for(int i=1; i<=n; i++)
        {
            for(int j=i; j<=n; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*"); 
        }
         for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    
}
