/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logic.practice;

/**
 *
 * @author Home
 */

class Vehicle
{
    int noOfTyres;
    String name;
    
    public void disPlay()
    {
        System.out.println("I am a vehicle");
    }
}

class Car extends Vehicle
{
    String color;
    
    public void disPlay()
    {
        System.out.println("I am a Car");
    }
}

class Auto extends Vehicle
{
    boolean automatic;
    
    public void disPlay()
    {
        System.out.println("I am a Auto");
    }
}


public class Test1 {
    
    public static void main(String[] args) {
        
        Vehicle v =new Vehicle();
        Car c =new Car();
        Auto au = new Auto();
        
        Test1 t=new Test1();
        
        t.displayDetails(c);
        t.displayDetails(v);
        t.displayDetails(au);
    }
    
    public void displayDetails(Vehicle v)
    {
        v.disPlay();
    }
}
