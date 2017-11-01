/*
 */
package SuperKeyword;

public class SuperKeyword3 
{
    public static void main(String[] args) 
    {
        B2 obj=new B2();
        obj.abc();    
    }
}
class B1        // super class
{
    public void abc()
    {
        System.out.println("A  abc ");
    }
}
class B2 extends B1         // sub class
{
    public void abc()
    {
        super.abc();
        System.out.println("B abc");
    }
}
