/*
 write  a program  of Overloading method
 */
package overloadingMethodDemo;
class Overload
{
    public void show()
    {
        System.out.println("1st overlod method  ");
    }
    public void show(int i)
    {
        System.out.println("2nd overload method is : "+i);
    }
    public void show(int a,int b)
    {
        System.out.println("Welcome to 3rd Overload method is ="+a +","+b);
    }
    public void show(int a, int b, int c)
    {
        System.out.println("Welcome to 4th Overloading method is = "+a+","+b+","+c);  
    }
}

public class OverloadingDemo1 {
    public static void main(String[] args) {
        Overload obj=new Overload();
        obj.show();
        obj.show(9);
        obj.show(10, 15);
        obj.show(2,4,6);
    }
    
}
