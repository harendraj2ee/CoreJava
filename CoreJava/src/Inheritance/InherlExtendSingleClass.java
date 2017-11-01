/*
 All the feature adding from class B1 to B2
output: -
Addition of two number is : 25
Subtration of two number is : 15
 */
package Inheritance;

class Add
{
    int num1,num2, result=0;
    public void add()
    {
        result=num1+num2;
    }
}
class AddSub extends Add
{
    public void sub()
    {
        result=num1-num2;
    }
}
public class InherlExtendSingleClass {
    public static void main(String[] args) {
        AddSub obj=new AddSub();
        obj.num1=20;
        obj.num2=5;
        obj.add();
        
        System.out.println("Addition of two number is : "+obj.result);
        
        obj.sub();
        System.out.println("Subtration of two number is : "+obj.result);
    }
    
}
