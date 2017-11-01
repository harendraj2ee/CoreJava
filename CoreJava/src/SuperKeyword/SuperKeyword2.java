/*
 Super Keyword part-2
 */
package SuperKeyword;

public class SuperKeyword2 
{
    public static void main(String[] args) 
    {
        A2 obj=new A2();
        obj.show();
    } 
}
class A1        // super class
{
    int i=6;
}
class A2 extends A1     // sub class
{
    int i=4;
    public void show()
    {
        System.out.println("sub class variale "+i);
        System.out.println("Super class number "+super.i);     //super class call
    }
}
