/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class TwoDPoint4
    {
        int x;
        int y;
        TwoDPoint4(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
    }
public class TestTwoDPoint4 {
    
    public static void main(String[] args) {
        
        TestTwoDPoint4 test= new TestTwoDPoint4();
        TwoDPoint4 tp1=test.makeTwoDPoint(1, 2);
        TwoDPoint4 tp2=test.makeTwoDPoint(3, 4);
        TwoDPoint4 tp3=test.sumPointValue(tp1, tp2);
        System.out.println(tp3.x+" "+tp3.y);
    }
    public TwoDPoint4 sumPointValue(TwoDPoint4 tp1, TwoDPoint4 tp2)
    {
        TwoDPoint4 tp3=makeTwoDPoint(tp1.x+tp2.x, tp1.y+tp2.y);
        
        return tp3;
        
    }
    TwoDPoint4 makeTwoDPoint(int x, int y)
    {
        TwoDPoint4 tp1=new TwoDPoint4(x,y);
        return tp1;
    }
    
}
