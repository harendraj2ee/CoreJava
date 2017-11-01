/*
 MultiLevel Inheritance
 */
package Inheritance;

import java.util.Scanner;

class Addition //Super,Parent,Base class
{

    
    int num1, num2, result = 0;

    public void add() {
        result = num1 + num2;
    }
}
//Sub, Child, Derived

class Subtract extends Addition //Single Level Inheritance
{

    public void sub() {
        result = num1 - num2;
    }
}

class Multipliction extends Subtract //Multi Level Iheritance
{

    public void mul() {
        result = num1 * num2;
    }
}

class Divide extends Multipliction {

    public void div() {
        result = num1 / num2;
    }
}

class Modulus extends Divide {

    public void mod() {
        result = num1 % num2;
    }
}

public class InherMultLevelCalculator {

    public static void main(String[] args) {
        Modulus obj = new Modulus();
         
         Scanner input=new Scanner(System.in);
         System.out.print("Enter a 1st number is : ");
         int firNum=input.nextInt();
         System.out.print("Enter a 2nd number is : ");
         int secNum=input.nextInt();
         
        /*obj.num1 = 25;   
        obj.num2 = 4; */
         
         obj.num1=firNum;
         obj.num2=secNum;
         
        obj.add();
        System.out.println("Sum of two number is : " + obj.result);
        obj.sub();
        System.out.println("Subtract of two number is : " + obj.result);
        obj.mul();
        System.out.println("Multiplication of two number is : " + obj.result);
        obj.div();
        System.out.println("Division of Two number is : " + obj.result);
        obj.mod();
        System.out.println("Modulus of two number is : " + obj.result);

    }

}
