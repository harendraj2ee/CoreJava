/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializationDemo;
import java.io.*;
class Dog implements Serializable{
    int i=10;
    int j=20;
}

public class SerializeDemo {
    public static void main(String[] args) throws Exception
    {
        Dog d1=new Dog();
        // Serialization
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        
        // De-Serializtion
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog) ois.readObject();
        
        System.out.println(d2.i+ " ----------- " +d2.j); // 10------20
    }
    
}
