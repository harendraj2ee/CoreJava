/*
Example:

In this example we are fetching few characters of the input string using charAt() method.
 */
package harendra;

public class CharAtDemo 
{
    public static void main(String args[]) 
    {
        String str = "Welcome to string handling tutorial";
       int len=str.length();
	char ch1 = str.charAt(0);
	char ch2 = str.charAt(5);
	char ch3 = str.charAt(11);
	char ch4 = str.charAt(20);
        char ch5 = str.charAt(len-2);
	System.out.println("Character at 0 index is: "+ch1);
	System.out.println("Character at 5th index is: "+ch2);
	System.out.println("Character at 11th index is: "+ch3);
	System.out.println("Character at 20th index is: "+ch4);
        System.out.println(ch5);
    }
    
}
