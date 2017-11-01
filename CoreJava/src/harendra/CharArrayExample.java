/*
Example: toCharArray() method

 In this example we are converting a String into array of chars using toCharArray() method
 */
package harendra;


public class CharArrayExample 
{
    public static void main(String args[]){
       String str = new String("Welcome to BeginnersBook.com");
       char[] array= str.toCharArray();
       System.out.println("Content of Array : ");
        System.out.println("{");
       for(char c: array){
           System.out.println(c);
       }
        System.out.println("}");
   }
    
}
