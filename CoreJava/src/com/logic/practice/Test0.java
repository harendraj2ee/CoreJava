/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;

/**
 *
 * @author Home
 */
//Concepts covered - Start with inheritance. How the field name is accessible to Student but the field school is not accessible to Test0
	
class Person
{
  String name;
  public Person(String name)
  {
      this.name=name;
  }
  public void disPlay()
  {
      System.out.println(name);
  }
  public void disPlay(String str)
  {
      System.out.println(str+" "+name);
  }
}

class Student extends Person
{
    String school;
    public Student(String name, String school)
    {
        super(name);
        this.school=school;
    }
    public void disPlay()
    {
        System.out.println("I am "+name);
    }
}





public class Test0
        {
            public static void main(String[] args) {
                
                Student student =new Student("","");
                student.disPlay();
                Person p=new Student("ABC", "3");
                p.disPlay();
            }
        }