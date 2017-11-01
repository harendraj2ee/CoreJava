/*
Staic Block
 */
package StaticMethodVariableBlock;

public class StaticBolock2
{
    static String str="";
    static
    {
     str="Welcome Static";   
    }
    public static void main(String[] args)
    {
        System.out.println("The Value for str is : "+str);
    }
    
}
