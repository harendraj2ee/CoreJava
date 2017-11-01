/*
 To print * is like this

*
**
***
****
*****
******
*******
********
*********
**********

 */
package com.harry.star;

public class TriangleStar2
{
    public static void main(String[] args)
    {
        System.out.println("To print * is like this");
        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
