/*
 AreaOfSquare
Problem Statement

You have been given 4 inputs x1,y1,x2 and y2. The points (x1,y1) and (x2,y2) represent the end points
of the diagonal of a square. Return the area of the square.
 */
package com.module1a.basic;

import java.util.Scanner;

public class AreaOfSquare
{
    public static void main(String[] args)
    {
      AreaOfSquare obj=new AreaOfSquare();
      Scanner input=new Scanner(System.in);
        System.out.println("Enter a 1st number is = ");
        int a=input.nextInt();
        System.out.println("Enter a 2nd number is = ");
        int b=input.nextInt();
        System.out.println("Enter a 3rd number is = ");
        int c=input.nextInt();
        System.out.println("Enter a 4th number is = ");
        int d=input.nextInt();
        double result=obj.areaOfSquare(a, b, c, d);
        System.out.println("Area of Square is = "+result);
        
        
    }
    public double areaOfSquare(int x1, int y1, int x2, int y2)
    {
        return	(Math.pow((x1-x2),2)+Math.pow((y1-y2),2))/2;
    }
}
