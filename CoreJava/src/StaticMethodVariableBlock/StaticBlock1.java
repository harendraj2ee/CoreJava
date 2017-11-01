/*
 Static Block program
 */
package StaticMethodVariableBlock;


public class StaticBlock1
{
    static   // static Block
    {
        System.out.println("Hello Static Block 1");
    }
    public static void main(String[] args)
    {
        System.out.println("In Main Method ");
    }
    static 
    {
        System.out.println("Hello Static Block  2");
    }
}
