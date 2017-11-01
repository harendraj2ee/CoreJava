/* Write  a program overload method 
Notes :- There are two types of polymorphism in java: compile time polymorphism and runtime polymorphism. 
We can perform polymorphism in java by method overloading and method overriding.
*/

package overloadingMethodDemo;

class A
{
    public void show()
    {
        System.out.println("Overloading Method");
    }
}
public class OverloadDemo {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
    }    
}
