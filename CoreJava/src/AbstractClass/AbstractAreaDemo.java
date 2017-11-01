/*
 using Abstract Class 
 */
package AbstractClass;

abstract class Figure
{
    double dim1;
    double dim2;
     Figure(double a, double b)
    {
       dim1=a;
       dim2=b;
    }
     //area is now an abstract method
     abstract double area();
}
class Rectangle1 extends Figure
{

    public Rectangle1(double a, double b)
    {
        super(a, b);
    }
    double area()
    {
        System.out.println("Inside Area for Rectangle ");
        return dim1*dim2;
    }
}
class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a,b);
    }
        // Override area for right triangle
        double area()
        {
            System.out.println("Inside Area for Triangle : ");
            return dim1*dim2/2;
        }
}
public class AbstractAreaDemo 
{
    public static void main(String[] args)
    {
        Rectangle1 obj1=new Rectangle1(2, 6);
        Triangle obj2=new Triangle(5, 7);
        
        Figure fig;
        fig=obj1;
        System.out.println("Area is : "+fig.area());
        fig=obj2;
        System.out.println("Area is : "+fig.area());
        
    }    
}
