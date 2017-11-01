/*
 Write a program Object Creation in Inheritance | Constructor | Super
 */
package Inheritance;
class B1
{
    public B1()
    {
        System.out.println("Default constructor B1");
    }
    public B1(int i)
    {
        System.out.println("Parameterized Constuctor int  B1 : "+i);
    }
}
class B2 extends B1
{
    public B2()
    {
       // super(); // By Default  super() method call super class 
        System.out.println("Default Constructor B2");
    }
    public B2(int i)
    {
        System.out.println("Parameterized Constructor B2 extends class : "+i);
    }
            
}
public class inheriConstructorSuper 
{
    public static void main(String[] args) 
    {
       // B1 obj=new B1(5); // Default Const no excute extend class
       // B1 obj=new B2(5);  // it also possible reference of super class & object of sub class
        B2 obj=new B2(3);    
    }
    
}
