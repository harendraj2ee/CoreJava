/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

class Encap
{
 private int i;
 public void setI(int j)
 {
     i=j;
 }
 public int getI()
 {
     return i;
 }
}
public class  EncapDemo
{
    public static void main(String[] args) 
    {
    Encap   obj=new Encap();
    obj.setI(5);
    System.out.println(obj.getI());

    } 
} 
