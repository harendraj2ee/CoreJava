/*
 Enter a number is : 8
To Print like this : 
*
**
***
****
*****
******
*******
********
******** 
******* 
****** 
***** 
**** 
*** 
** 
* 
 */
package com.harry.star;

import java.util.Scanner;

public class StarPrint4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number is : ");
        int n=sc.nextInt();
        System.out.println("To Print like this : ");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
       for(int i=1; i<=n; i++)
        {
            for(int j=i; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        } 
    }
}
