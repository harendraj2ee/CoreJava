/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

import java.util.Scanner;

class EncAdd
{
    private int num1,num2;
    public void setM(int num3)
    {
        num1=num3;
    }
    public int getM()
    {
        return num1;
    }
    public void setN(int num4)
    {
        num2=num4;
    }
    public int getN()
    {
        return num2;
    }
    
}
public class EncapAddDemo {
    public static void main(String[] args) {
        EncAdd obj=new EncAdd();
       // if Taking user input 
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number is :");
        int a=sc.nextInt();
        System.out.print("Enter a second number is :");
        int b=sc.nextInt();
        
        obj.setM(a);
        obj.setN(b);
        // if by pass value 
        
        /*obj.setM(23);
           obj.setN(27); */
        
        int sum=obj.getM()+obj.getN();
        System.out.println("Addition is of two number is = "+sum);
        
    }  
}
