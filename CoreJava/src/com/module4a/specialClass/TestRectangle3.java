/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */

class Rectangle3
{
    int length;
    int breadth;
    /*int[] length;
    int[] breadth;
    public Rectangle3(int[] length, int[] breadth)
    {
        this.length=new int[length.length];
        for(int i=0; i<length.length; i++)
        {
            this.length[i]=length[i];
        }
        this.breadth= new int[breadth.length];
        for(int i=0; i<breadth.length; i++)
        {
            this.breadth[i]=breadth[i];
        }
    }*/
    
}


public class TestRectangle3 {
    public static void main(String[] args) {
        
       
        TestRectangle3 rect1=new TestRectangle3();
       Rectangle3[] rect2=rect1.createRectangles(new int[]{50,23,34,45},new int[]{49,12,33,44});
       Rectangle3 rect4=rect1.largestArea(rect2);
        System.out.println("Largest Area Rectangle having: length:"+rect4.length+" breadth:"+rect4.breadth);
     /*  Rectangle3 rect3=rect1.largestPerimeter(rect2);
       
       
       
           System.out.println("Rectangle of length and breadth"+rect3.length+" "+rect3.breadth);*/
      
    }
    
    public Rectangle3[] createRectangles(int[] lengths, int[] breadths)
    {
        Rectangle3[] arrRect=new Rectangle3[lengths.length];
        for(int i=0; i<lengths.length; i++)
        {
            Rectangle3 r1= new Rectangle3();
            r1.length=lengths[i];
            r1.breadth=breadths[i];
            arrRect[i]=r1;
        }
        return arrRect;
    }
    public double computeArea(Rectangle3 rect)
    {
        double area=rect.length*rect.breadth;
        return area;
    }
 
    public Rectangle3 largestArea(Rectangle3[] R){
        Rectangle3 r=null;
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
    /*public Rectangle3 largestPerimeter(Rectangle3[] R){
        Rectangle3 target=null;
        int max=0;
        for(int i=0;i<R.length;i++)
        {
            if(computePerimeter(R[i])>max)
            {
                max=computePerimeter(R[i]);
                target=R[i];
            }
        }
        return target;
    }
    public int computePerimeter(Rectangle3 rect)
    {
        int perimeter=2*(rect.length+rect.breadth);
        return perimeter;
    }*/
}
