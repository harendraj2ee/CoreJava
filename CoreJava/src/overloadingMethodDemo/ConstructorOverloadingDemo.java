/*
 constructor is allocate memory  
 constructor does not return type 

 */
package overloadingMethodDemo;

class B
{
    public void B()
    {
        System.out.println("1st Constructor Overloading ");
    }
    public void B(int i)
    {
        System.out.println("2nd Constructor Overloading method is : "+i);
    }
    public void B(int i, int j)
    {
        System.out.println("3rd Constructor Overloading method is : "+i+","+j);
    }
    public void B(int i, int j, int k)
    {
        System.out.println("4th Constructor Overloading method is : "+i+","+j+","+k);
    }
    public void B(int i, int j, int k, int l)
    {
        System.out.println("5th Constructor Overloading method is : "+i+","+j+","+k+","+l);
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        B obj=new B();
        obj.B();
        B obj1=new B();
        obj1.B(55);
        B obj2=new B();
        obj2.B(65,75);
        B obj3=new B();
        obj3.B(80, 85, 90);
        B obj4=new B();
        obj4.B(91,93,95,97);
    }
    
}
