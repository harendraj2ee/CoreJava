/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;
class Encap1{
    private int a,b;
    public void setI(int c)
    {
        a=c;
    }
    public int getI()
    {
        return a;
    }
    public void setM(int d)
    {
        b=d;
    }
    public int getM()
    {
        return b;
    }
}

public class EncapMore1Vari {
    public static void main(String[] args) {
        Encap1 obj=new Encap1();
        obj.setI(10);
        System.out.println(obj.getI());
        
         obj.setM(20);
         System.out.println(obj.getM());
        
    }
    
}
