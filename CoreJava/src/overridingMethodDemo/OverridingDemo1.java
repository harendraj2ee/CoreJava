/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingMethodDemo;
class A
{
    public void show()
    {
        System.out.println("1st Overriding method");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("Welcome to 2nd Overriding Method ");
    }
}

public class OverridingDemo1 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.show();
        
    }
    
}
