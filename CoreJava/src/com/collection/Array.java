/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.ArrayList;


public class Array
{
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("Google");
        a1.add("MicroSoft");
        a1.add("Apple");
        a1.remove(1);
        System.out.println("Remove is : "+a1);
    }
    
}
