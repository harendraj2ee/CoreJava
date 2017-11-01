/*
 WRP to Abstract class
 */
package AbstractClass;

public  class AbstractClass
{
    public static void main(String[] args) 
    {   
       // A obj=new B();
        B obj=new B();
        obj.callMeTo();
        obj.callMe();
    }
}
abstract class A
{
    public abstract void callMe();
    void callMeTo()  //Concret method are still allowed in abstrat class
    {
        System.out.println("This is the Concret Method");
    }
}
class B extends A
{
    public void callMe()
    {
        System.out.println("B's implementation of callMe");
    }
    
}