/*
 ComputeGrade
Problem Statement

Given the marks of a student in five subjects, compute the overall grade. The grades will be on the basis of the aggregate 
percentage.if overall percentage >= 85%, grade is A, if it is >=75% it is B, >=60% is C, >=45% is D, if it is >=33% it is E else F.
 */
package com.module1b.basic2;

import java.util.Scanner;

public class ComputeGrade 
{
    public static void main(String[] args) 
    {
        ComputeGrade obj=new ComputeGrade();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st number is =");
        int a=input.nextInt();
        System.out.print("Enter 1st number is =");
        int b=input.nextInt();
        System.out.print("Enter 1st number is =");
        int c=input.nextInt();
        System.out.print("Enter 1st number is =");
        int d=input.nextInt();
        System.out.print("Enter 1st number is =");
        int e=input.nextInt();
        char result=obj.isComputeGrade(a, b, c, d, e);
        System.out.println("Grade is = "+result);
        
    }
    public char isComputeGrade(int marks1,int marks2, int marks3, int marks4, int marks5)
    {
        int percentage=(marks1+marks2+marks3+marks4+marks5)*100/500;
		if(percentage>=85)
		return 'A';
		else if(percentage>=75)
		return 'B';
		else if(percentage>=60)
		return 'C';
		 else if(percentage>=45)
		 return 'D';
		 else if (percentage>=33)
		 return 'E';
		 else
		 return 'F';
    }
    
}
