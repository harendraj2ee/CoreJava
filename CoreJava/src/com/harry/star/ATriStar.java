/*
 Write a Program a Dimond * shape

*
***
*****
*******
*****
***
*

 */
package com.harry.star;

public class ATriStar {

    public static void main(String[] args) {
        int noOfColumn = 1;
        System.out.println("Dimond shape is ");
        for (int i = 1; i <= 7; i++) 
        {
            for (int j = 1; j <= noOfColumn; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i < 4)
            {
                noOfColumn = noOfColumn + 2;
            }
            else
            {
                noOfColumn=noOfColumn - 2;
            }

        }
        
    }

}
