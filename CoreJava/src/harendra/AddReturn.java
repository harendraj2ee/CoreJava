/*
 * Write a program Addtion of two number is  
 */
package harendra;

import java.util.Scanner;


public class AddReturn 
{
    public static void main(String[] args)
    {
        AddReturn obj=new AddReturn();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a first number is = ");
        int num1=input.nextInt();
        System.out.println("Enter a second number is =");
        int num2=input.nextInt();
       int s=obj.addMetho(num1,num2);
        System.out.println("sum of Two number is= "+s);
        
        
    }
    public int addMetho(int x,int y)
    {
         int sum=x+y;
         return sum;
    }
    
}
