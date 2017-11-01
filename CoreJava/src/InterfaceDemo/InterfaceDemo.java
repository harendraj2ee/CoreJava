/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDemo;

interface A
{
    public void show();
}
  class B implements A
{
    public void show()
    {
        System.out.println("Hello Interface");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
     B obj=new B();
     obj.show();;
    }
    
}
