/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingMethodDemo;
class B1
{
    public void show(int i)
    {
        System.out.println("1st Overriding method is : "+i);
    }
}
class B2 extends B1
{
    public void show(int j)
    {
        System.out.println("2nd Overriding method is : "+j);
    }
}
class B3 extends B2
{
    public void show(int k)
    {
        System.out.println("3rd Overriding method is : "+k);
    }
}
class B4 extends B3
{
    public void show(int l)
    {
        System.out.println("4th Overriding method is : "+l);
    }
}
public class OverridingDemo2
{
    public static void main(String[] args) {
        B1 obj1= new B1();
        obj1.show(5);
        B2 obj2=new B2();
        obj2.show(7);
        B3 obj3 = new B3();
        obj3.show(20);
        B4 obj4=new B4();
        obj4.show(25);
    }
}
