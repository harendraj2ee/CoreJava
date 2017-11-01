/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//write your code here
package com.module4a.specialClass;

/**
 *
 * @author Home
 */

class Rectangle5
{
    int length;
    int breadth;
    
    
}


public class TestRectangle5 {
    public static void main(String[] args) {
        
       
        TestRectangle5 rect1=new TestRectangle5();
       Rectangle5[] rect2=rect1.createRectangles(new int[]{50,23,34,45},new int[]{49,12,33,44});
       Rectangle5 rect4=rect1.largestArea(rect2);
        System.out.println("Largest Area Rectangle having: length:"+rect4.length+" breadth:"+rect4.breadth);
    
    }
    
    public Rectangle5[] createRectangles(int[] lengths, int[] breadths)
    {
        Rectangle5[] arrRect=new Rectangle5[lengths.length];
        for(int i=0; i<lengths.length; i++)
        {
            Rectangle5 r1= new Rectangle5();
            r1.length=lengths[i];
            r1.breadth=breadths[i];
            arrRect[i]=r1;
        }
        return arrRect;
    }
    public double computeArea(Rectangle5 rect)
    {
        double area=rect.length*rect.breadth;
        return area;
    }
 
    public Rectangle5 largestArea(Rectangle5[] R){
        Rectangle5 r=null;
        double max=0;
    for(int i=0;i<R.length;i++)
    {
        if(computeArea(R[i])>max){
        max=computeArea(R[i]);
        r=R[i];
    }
    }
    return r;
    }
    
}

