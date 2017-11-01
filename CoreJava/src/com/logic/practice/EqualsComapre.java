/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;

/**
 *
 * @author Welcome
 */
public class EqualsComapre {
    public static void main(String[] args) {
        
        String s1=new String("durga");
        String s2=s1;
        String s3="durga";
        String s4="durga";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    
}
