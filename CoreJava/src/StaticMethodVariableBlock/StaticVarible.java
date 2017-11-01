/*
Note : - Static method use static varilbe , not static variable not use static method
 */
package StaticMethodVariableBlock;

public class StaticVarible
{
    public static void main(String[] args) {
        Display.i=5;
        Display.show();
        
    }  
}
class Display
{
    static int i;
    public static void show()
    {
        System.out.println("We can use Static Variable :" +i);
    }
}
