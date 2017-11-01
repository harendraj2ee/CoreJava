/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Student
{
    String name;
    int[] marks;
    public Student(String name, int[] m)
    {
        this.name=name;
        //marks=m;
        marks=new int[m.length];
        for(int i=0; i<m.length; i++)
        {
            marks[i]=m[i];
        }
    }
}


public class TestStudent {
    
    public static void main(String[] args) {
        int[] marks={88,92,76,81,83};
        
        Student ob=new Student("Bill", marks);
        //marks=null;
        System.out.println("Name of Student:"+ob.name);
        System.out.print("Marks{");
        for(int i=0; i<ob.marks.length; i++)
        {
            System.out.print(ob.marks[i]+",");
        }
        System.out.println("}");
       
    }
    
}
