/*
Implicite constructor means which parameter pass by the object which method call the costrucotr 
if not parameter pass the value in a constructr object then call Default constructor method 
 */
package ImplicitConstrucotor;

class ImpliConst
{
    public ImpliConst ()
    {
        System.out.println("This is the Default Construcotr");
    }
    public ImpliConst(int i)
    {
        System.out.println("This is one parameterized Construcotr : "+i);
    }
    public  ImpliConst(int i, int j)
    {
        System.out.println("This is two Parameterized Construcotr : "+i +","+j);
    }
}

public class ImplicitConstructorDemo 
{
    public static void main(String[] args) {
        //ImpliConst obj=new ImpliConst();  // default constructor
        //ImpliConst obj=new ImpliConst(6);
        ImpliConst obj1=new ImpliConst(5,7);
       
    }
    
}
