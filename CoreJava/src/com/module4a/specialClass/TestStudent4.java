/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Student4
{
    String name;
    String marks;
    public Student4(String name, String marks)
    {
        this.name=name;
        this.marks=marks;
    }
}

public class TestStudent4 {
    public static void main(String[] args) {
        Student4 st= new Student4("Ravi", "23,54,87,65");
        TestStudent4 st2= new TestStudent4();
        Student4 st3=st2.createStudent(st.name, st.marks);
        System.out.println(st3.name+" "+st3.marks);
    }
    
    public Student4 createStudent(String nameStr, String marksStr)
    {
        Student4 st1= new Student4(nameStr, marksStr);
        return st1;
    }
    
}
