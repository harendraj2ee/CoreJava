/*
 LastDigit
You have been given three numbers x, y and z as input. Compute the value of 
x^2 + y^3 + z^4 and return the last digit (one's digit) of the computed value.
 */
package module1a.Assignment;

import java.util.Scanner;


public class LastDigit 
{
    public static void main(String[] args)
    {
        LastDigit obj=new LastDigit();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 1st number is : ");
        int a=input.nextInt();
          System.out.print("Enter a 2nd number is : ");
        int b=input.nextInt();
          System.out.print("Enter a 3rd number is : ");
        int c=input.nextInt();
        int result=obj.lastDigit(a, b, c);
        System.out.println("Addition of three values then last digit is = "+result);
        
        
    }
    public int lastDigit(int x, int y, int z)
    {
        int sqr=0,que=0,powfour=0;
        int sum=0,rem=0;
        sqr=x*x;
        que=y*y*y;
        powfour=z*z*z*z;
        sum=sqr+que+powfour;
        
        return sum%10;
        
    }
    
}
