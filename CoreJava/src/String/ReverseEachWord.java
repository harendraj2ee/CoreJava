/*
 WAP To print Reverse Each word 
ex. Input :- String str="Ram Gopal Verma ";
   Output :- maR lapoG amreV
// */
package String;

import java.util.Scanner;

public class ReverseEachWord 
{
    public static void main(String[] args)
    {
       String str="Ram Gopal Verma";
       int len=str.length();
       String result="";
       String result1="";
       String result2="";
       String result3="";
       for(int i=0; i<len; i++)
       {
           if(i<=2){
                char ch=str.charAt(i);
                result=ch+result;
           }
           if(i>=3 && i<=9)
           {
               char ch1=str.charAt(i);
               result1=ch1+result1;
           }
           if(i>9)
           {
               char ch2=str.charAt(i);
               result2=ch2+result2;
           }
           result3=result+result1+result2;
               
       }
        System.out.println(result3);
       
    }
    
}
