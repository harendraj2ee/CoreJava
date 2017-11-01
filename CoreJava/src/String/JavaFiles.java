/*
 A file name in java ends in .java. Given the name of the file, return true if its a java file, else return false
 */
package String;

import java.util.Scanner;


public class JavaFiles 
{
    public static void main(String[] args) {
        JavaFiles obj=new JavaFiles();
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        boolean result=obj.isJavaFiles(s);
        System.out.println("result is = "+result);
    }
    public boolean isJavaFiles(String str)
    {
        int len=str.length();
        String str1=new String(".java");
        String str2=new String(str.substring(len-5, len));
        if(str1.equals(str2))
            return true;
        else
            return false;
    }
    
    
}
