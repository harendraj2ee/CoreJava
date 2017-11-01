/*
Java – String lastIndexOf() Method example
 */
package harendra;


public class LastIndexOfDemo
{
    public static void main(String args[]) {
       String str1 = new String("This is a BeginnersBook tutorial");
       String str2 = new String("Beginners");
       String str3 = new String("Book");
       String str4 = new String("Books");
       System.out.println("Last 'B' in str1: "+str1.lastIndexOf('B'));
       System.out.println("Last 'B' in str1 whose index<=15 : "+str1.lastIndexOf('B', 15));
       System.out.println("Last 'B' in str1 whose index<=30 : "+str1.lastIndexOf('B', 30));
       System.out.println("Last occurrence of str2 in str1 : "+str1.lastIndexOf(str2));
       System.out.println("Last occurrence of str2 in str1 before 15 : "+str1.lastIndexOf(str2, 15));
       System.out.println("Last occurrence of str3 in str1 = "+str1.lastIndexOf(str3));
       System.out.println("Last occurrence of str4 in str1 = "+str1.lastIndexOf(str4));
       System.out.println("Last occurrence of 'is' in str1 = "+str1.lastIndexOf("is"));
       System.out.println("Last occurrence of 'is' in str1 before 4 = "+str1.lastIndexOf("is", 4));
   }
}
