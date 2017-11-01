/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/*Problem Statement

Create a class Result that contains the following fields – marks(of type int[]).
* The int[] marks contains the marks obtained by a student in the various examinations that were conducted.
* In the class Result also define the following functions - maxMarks : 
* which returns the maximum marks scored (it is the maximum value in the int[] marks). 
* - avgMarks : which returns the average marks scored in the exams. - totalMarks : 
* which returns the total marks scored in the exams. Also define the class TestResult
* in which there is function which created a new Result and displays the values of max marks and average marks. 
* Note that for calculating max marks and average marks, you should use the methods defined in the class Result.
 */

class   Result
{
    int[] marks;
    
    public int maxMarks()
    {
        int max=0;
        for(int i=0; i<marks.length; i++)
        {
            if(max<marks[i])
                max=marks[i];
        }
        return max;
    }
    
    public double avgMarks()
    {
        double avg=0;
        int sum=0;
        if(marks!=null && marks.length!=0)
        {
            for(int i=0; i<marks.length; i++)
            {
                sum+=marks[i];
            }
            avg=sum/marks.length;
        }
        return avg;
    }
    
    public int totalMarks()
    {
        int total=0;
        for(int i=0; i<marks.length; i++)
        {
            total+=marks[i];
        }
        return total;
    }
}



public class TestResult {
    public static void main(String[] args) {
        
        Result result= new Result();
        result.marks=new int[]{67,89,64,90,83};
        System.out.println("Maximum marks obtained by Student");
        System.out.println(result.maxMarks());
        System.out.println("Total Marks Obtained:");
        System.out.println(result.totalMarks());
        System.out.println("Average marks:");
        System.out.println(result.avgMarks());
        System.out.println("---------------------");
        TestResult t=new TestResult();
        t.display(result);
    }
    
    public void display(Result r)
    {
        int max=0,total=0;
        double avg=0;
        if(r!=null)
        {
        max=r.maxMarks();
        total=r.totalMarks();
        avg=r.avgMarks();
        }
        System.out.println("Max Marks:"+max);
        System.out.println("Total:"+total);
        System.out.println("Average:"+avg);
        
    }
    
}
