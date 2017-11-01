/*
Write  program overriding program

 There are two types of polymorphism in java: compile time polymorphism and runtime polymorphism. We can perform polymorphism in
java by method overloading and method overriding.
 */
package overridingMethodDemo;
class OverRide1
{
    public void show()
    {
        System.out.println("1st override method ");
    }
}
    class OverRide2 extends OverRide1
    {
        
    }

public class OverridingDemo {
    public static void main(String[] args) {
        OverRide2 obj=new OverRide2();
        obj.show();
    }
    
}
