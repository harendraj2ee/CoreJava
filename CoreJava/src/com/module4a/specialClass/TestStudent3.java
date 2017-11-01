package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Student3
{
    String name;
    int[] marks;
    public Student3(String name, int[]marks)
    {
        this.name=name;
        this.marks=new int[marks.length];
        for(int i=0; i<marks.length; i++)
        {
            this.marks[i]=marks[i];
        }
    }
}

public class TestStudent3 {
    
    public static void main(String[] args) {
        int[] marks1={88,92,76,81,83};
        int[] marks2={90,78,81,99,87};
        //String name="Bill";
       Student3 st1= new Student3("Bill", marks1);
       Student3 st2=new Student3("Ravi", marks2);
        
        TestStudent3 test= new  TestStudent3();
        
        Student3 st3=test.betterStudent(st1, st2);
        System.out.println("Better Student name:"+st3.name);
        System.out.println("Marks:"+test.totalMarks(st3));
        
        /*if(test.totalMarks(st2)>test.totalMarks(st1))
        {
            System.out.println("Name of Student:"+st2.name+", Total marks:"+test.totalMarks(st2));
        }
        else
        {
           System.out.println("Name of Student:"+st1.name+", Total marks:"+test.totalMarks(st1)); 
        }*/
        
        
    }
    public Student3 betterStudent(Student3 st1, Student3 st2)
    {
        int a=totalMarks(st1);
        int b=totalMarks(st2);
        if(a>b)
            return st1;
        else
            return st2;
    }
    
    public int totalMarks(Student3 st)
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