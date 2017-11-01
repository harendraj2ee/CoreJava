/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;

/**
 *
 * @author Home
 */
public class Test2 {
    final static short x = 2;
   
    public static void main(String [] args) 
            
    { 
        int y=0;
        for (int z=0; z < 3; z++) 
        {
            switch (z) 
            {
                case 0: System.out.print("0 ");   /* Line 11 */
                case x-1: System.out.print("1 "); /* Line 12 */
                case x: System.out.print("2 ");   /* Line 13 */
            }
        }
    }
}
    
    

