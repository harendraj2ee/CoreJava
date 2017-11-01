/*
 Static Varible call satic method directly by class name
 */
package StaticMethodVariableBlock;

public class StaticVariable1 
{
    public static void main(String[] args) 
    {
        StaticVar.show();
    }
}
class StaticVar
{
    static int i=8;
    public static  void show()
    {
        System.out.println("This is the Static Method ");
        System.out.println("Static Variable is : "+i);
    }
}
