
package com.module4a.specialClass;

/**
 *
 * @author Home
 */
class Circle1
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


public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c= new Circle1();
        c.radius=5;
        Circle1 c1=new Circle1();
        c1.radius=8;
        //System.out.println("Area:"+c.Area());
        //System.out.println("Perimeter"+c.Perimeter());
        TestCircle1 c2=new TestCircle1();
        Circle1 c3=c2.largerCircle(c, c1);
        //Circle1 largerCircle= largerCircle(c,c1);
        System.out.println("Largest circle having Redius:"+c3.radius);
        //System.out.println("Larger Circle Area"+(largerCircle.Area()));
    }
    public Circle1 largerCircle(Circle1 circle1, Circle1 circle2)
    {
        if(circle1.Area()>circle2.Area())
            return circle1;
        else
            return circle2;
    }
    
}
