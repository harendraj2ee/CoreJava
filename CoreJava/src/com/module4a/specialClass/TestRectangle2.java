/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Rectangle2
{
   int length;
   int breadth;
   public Rectangle2(int length, int breadth)
   {
       this.length=length;
       this.breadth=breadth;
   }
}

public class TestRectangle2 {
    
    public static void main(String[] args) {
        //Rectangle2 ob= new Rectangle2(10, 12);
        TestRectangle2 trec= new TestRectangle2();
        Rectangle2 ob1=trec.createRectangle(12, 15);
        System.out.println("Length:"+ob1.length+" Breadth:"+ob1.breadth);
        System.out.println("Area:"+trec.computeArea(ob1));
        System.out.println("Perimeter:"+trec.computePerimeter(ob1));
    }
    public Rectangle2 createRectangle(int ln, int br)
    {
        Rectangle2 rct= new Rectangle2(ln, br);
        return rct;
    }
    
    public double computeArea(Rectangle2 rect)
    {
        double area=rect.length*rect.breadth;
        return area;
    }
    public int computePerimeter(Rectangle2 rect)
    {
        int perimeter=2*(rect.length+rect.breadth);
        return perimeter;
    }
}