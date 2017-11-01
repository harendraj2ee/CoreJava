/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Circle
{
    int radius;
    public double Area()
    {
        return 3.14*radius*radius;
    }
    public double Perimeter()
    {
        return 2*3.14*radius;
    }
}


public class TestCircle {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.radius=5;
        System.out.println("Area:"+c.Area());
        System.out.println("Perimeter"+c.Perimeter());
    }
    
}
