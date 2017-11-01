/*
 one interface an extends another
 */
package InterfaceDemo;

import InterfaceDemo.B1.B3;

interface B1
{
    void meth1();
    void meth2();
    // B1 now include meth1() and meth2() it adds meth3() also if we can
    public interface B2 extends B1
    {
        void meth3();
    }
    // this class must implement all of B1 & B2
    public class B3 implements B2
    {
        public void meth1()
        {
            System.out.println("Implements meth1()");
        }
        public void meth2()
        {
            System.out.println("Implements meth2()");
        }
        public void meth3()
        {
            System.out.println("Implements meth3()");
        }
    }
}
public class InterfaceDemo1 
{
    public static void main(String[] args) {
        B3 obj=new B3();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
    
}
