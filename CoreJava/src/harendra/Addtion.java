/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package harendra;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Addtion {
    public static void main(String[] args) 
    { 
        int num1,num2,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a first values is = " );
        num1=in.nextInt();
        System.out.println("Enter a second values is = " );
        num2=in.nextInt();
       
        sum=num1+num2;
        System.out.println("Add is = " +sum);
        
    }
    
}
