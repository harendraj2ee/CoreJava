/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class TwoDPoint2
{
    int x,y;
    TwoDPoint2(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}

public class TestTwoDPoint2 {
    
    public static void main(String[] args) {
        
        TestTwoDPoint2 test= new TestTwoDPoint2();
        TwoDPoint2 tp1= test.makeTwoDPoint(2, 1);
        System.out.println("Point 1:");
        System.out.println(tp1.x+" "+tp1.y);
        TwoDPoint2 tp2=test.makeTwoDPoint(1, 1);
        System.out.println("Point 2:");
        System.out.println(tp2.x+" "+tp2.y);
        TwoDPoint2 tp3=test.findFarthest(tp1, tp2);
        System.out.println("Point, Farthest from Origin:");
        System.out.println(tp3.x+" "+tp3.y);
    }
     TwoDPoint2 makeTwoDPoint(int x, int y)
    {
        TwoDPoint2 tp1=new TwoDPoint2(x,y);
        return tp1;
    }
     public TwoDPoint2 findFarthest(TwoDPoint2 tp1, TwoDPoint2 tp2)
     {
         int a=(tp1.x*tp1.x) +(tp1.y*tp1.y);
         int b=(tp2.x*tp2.x) +(tp2.y*tp2.y);
         if(a>b)
             return tp1;
         else
             return tp2;
     }
     
}

