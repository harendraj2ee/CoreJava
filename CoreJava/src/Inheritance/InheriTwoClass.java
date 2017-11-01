/*
Note :- 
all feature in class A of Adding to the  class B in this program.

 */
package Inheritance;
class A1
{
    public void add()
    {
        System.out.println("class A1");
    }
}
class A2
{
     public void sub()
    {
        System.out.println("adding all feature of class A1 to class A2");
    }
}
public class InheriTwoClass {
    public static void main(String[] args) {
        A2 obj=new A2();
        obj.sub();
    }
    
}
