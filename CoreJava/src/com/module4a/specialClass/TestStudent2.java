/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Student2
{
    String name;
    int[] marks;
    public Student2(String name, int[]marks)
    {
        this.name=name;
        this.marks=new int[marks.length];
        for(int i=0; i<marks.length; i++)
        {
            this.marks[i]=marks[i];
        }
    }
}

public class TestStudent2 {
    
    public static void main(String[] args) {
        int[] marks={88,92,76,81,83};
        //String name="Bill";
       Student2 st= new Student2("Bill", marks);
        System.out.println("Name of the Student:"+st.name);
        TestStudent2 test= new  TestStudent2();
        System.out.println("Total marks:"+test.totalMarks(st));
    }
    public int totalMarks(Student2 st)
    {
        int sum=0;
        if(st!=null && st.marks!= null)
        {
        for(int i=0; i<st.marks.length; i++)
        {
            sum+=st.marks[i];
        }
        }
        return sum;
    }
    
}
