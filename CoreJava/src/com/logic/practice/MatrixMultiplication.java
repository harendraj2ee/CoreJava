/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;
//import java.util.Scanner;
/**
 *
 * @author Welcome
 */
public class MatrixMultiplication {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int[][] m1={{3, 4, 7},{4, 8, 9},{8, 7, 5}};
        int[][] m2={{1, 2, 1},{2,1,3},{5,4,1}};
        int[][] m3=new int[3][3];
        for(int i=0; i<3; i++)
        { //int k=0;
        
            for(int j=0; j<3; j++)
            {
                m3[i][j]=0;
              for(int k=0; k<3; k++)
              {
                  m3[i][j]+=m1[i][k]*m2[k][j];
                  
              }
              System.out.print(m3[i][j]+" ");
               
            }
            System.out.println();
            
        }
        
    }
}
