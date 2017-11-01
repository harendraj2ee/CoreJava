/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */

class Rectangle
{
   int length;
   int breadth;
   public Rectangle(int length, int breadth)
   {
       this.length=length;
       this.breadth=breadth;
   }
}

public class TestRectangle {
    
    public static void main(String[] args) {
        Rectangle ob= new Rectangle(10, 12);
        System.out.println("Length:"+ob.length+" Breadth:"+ob.breadth);
    }
}
