/*
Note :- if we create static method then method call does not need create of Instance of Object
        if we are calling the method then we use directly class Name
 */
package StaticMethodVariableBlock;


public class StaticMethodDemo
{
    public static void main(String[] args) 
    {
        Abc.show();
    }   
}
class Abc
{
    public static void show()
    {
        System.out.println("Hello Static Method ");
    }
}