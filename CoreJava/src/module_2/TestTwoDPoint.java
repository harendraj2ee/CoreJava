/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package module_2;

class TwoDPoint
    {
        int x;
        int y;
        TwoDPoint(int x, int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    
    public class TestTwoDPoint
    {
        public static void main(String[] args)
        {
            TwoDPoint ob1= new TwoDPoint(2,2);
            TwoDPoint ob2= new TwoDPoint(3,3);
            System.out.println(ob1.x+","+ob1.y);
            System.out.print(ob2.x+","+ob2.y);
        }
    }