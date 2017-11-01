/*
 WAP to print a Reverse a String of Each Word taking user input
ex input :- String str="Hello Harendra Kumar Sah";
Output :- olleH ardneraH ramuK haS
 */
package String;

import java.util.Scanner;

public class ReverseEachWordInput 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String is : ");
        String source = sc.nextLine();
       

    for (String part : source.split(" ")) 
    {
    System.out.print(new StringBuilder(part).reverse().toString());
   // System.out.print(" ");
    }
        
    }
    
}
