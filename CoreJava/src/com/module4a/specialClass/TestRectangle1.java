/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Rectangle1
{
   int length;
   int breadth;
   public Rectangle1(int length, int breadth)
   {
       this.length=length;
       this.breadth=breadth;
   }
}

public class TestRectangle1 {
    
    public static void main(String[] args) {
        //Rectangle1 ob= new Rectangle1(10, 12);
        TestRectangle1 trec= new TestRectangle1();
        Rectangle1 ob1=trec.createRectangle(12, 15);
        System.out.println("Length:"+ob1.length+" Breadth:"+ob1.breadth);
    }
    public Rectangle1 createRectangle(int ln, int br)
    {
        Rectangle1 rct= new Rectangle1(ln, br);
        return rct;
    }
}
