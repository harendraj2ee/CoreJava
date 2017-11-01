/*
 Convert String to character array in Java
 */
package harendra;

import java.util.Scanner;


public class StringToChar
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=input.nextLine();
        //String str = "java2s.com hello harendra";
    char[] cArray = str.toCharArray();

    for (char c : cArray)
      System.out.print(c+" ");
    }
    
}
