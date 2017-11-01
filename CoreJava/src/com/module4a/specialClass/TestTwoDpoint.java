/*
 TwoDPoint
Create a class TwoDPoint that contains two fields x, y which are of type int. Define another class TestTwoDPoint, 
 where a main method is defined. The main method should create two TwoDPoint objects, assign them values 2,2 and 3,3 
and print them

 */
package com.module4a.specialClass;


class TwoDpoint
{
    int x, y;
}
 public class TestTwoDpoint
{
    public static void main(String[] args)
    {
     TwoDpoint point1=new TwoDpoint();
     point1.x=2;
     point1.y=2;
     TwoDpoint point2=new TwoDpoint();
     point2.x=3;
     point2.y=3;
        System.out.println("Point1 =" +point1.x + ","+point1.y);
        System.out.println("Point2 =" +point2.x + " ," +point2.y);
    }
    
}
