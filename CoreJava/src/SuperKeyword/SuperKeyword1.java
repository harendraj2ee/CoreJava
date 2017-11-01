/*
 Super Keyword part -1
 */
package SuperKeyword;

public class SuperKeyword1 
{
    public static void main(String[] args) 
    {
        B obj=new B();
       // B obj1=new B(7);
    }
}
class A extends Object      //Super Class
{
    public A()      // super() method
    {
        System.out.println("In Constructor A");
    }
    public A(int i)
    {
       //super();
       System.out.println("In parameter Construcot A");  
    }
}
class B extends A       //sub class
{
    public B()
    {
        System.out.println("In Constructor B");
    }
    public B(int i)
    {
        super(i);
        System.out.println("In parameterized Constructor B");
    }
}
