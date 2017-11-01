/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

public class CountCommonChars 
{
    public static void main(String[] args) 
    {
        CountCommonChars obj=new CountCommonChars();
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        System.out.println("result "+obj.commonCount(str1, str2));
        
    }
    public  int commonCount(String str1, String str2)
    {
        int len1=str1.length();
        int len2=str2.length();
        int count=0;
        int i=0;
        if(len1<=len2)
        {
            i=len1;
        }
        else
            i=len2;
        for(int j=0; j<i; j++)
        {
            if(str1.charAt(j)==str2.charAt(j))
                count++;
        }
        return count;
    }
    
}
