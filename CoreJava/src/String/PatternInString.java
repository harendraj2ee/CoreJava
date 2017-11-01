/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

public class PatternInString 
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        PatternInString obj=new PatternInString();
        String str1=input.nextLine();
        String str2=input.nextLine();
       // boolean res=obj.pattern(str1, str2)
        System.out.println("result "+obj.pattern(str1, str2));
    }
        
        public boolean pattern(String str1, String str2)
        {
        if(str1.contains(str2))
            return true;
        else
            return false;
        }
    }
    
    

