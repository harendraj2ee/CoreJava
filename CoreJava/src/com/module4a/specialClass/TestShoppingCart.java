/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */

class ShoppingCart
{
    Item[] items;
    double totalAmount;
}

class Item
{
    String name;
    String productId;
    double price;
    int quantity;
    double amount;
    
    public Item(String name, String pid, String price, String qty)
    {
        this.name=name;
        productId=pid;
        this.price=Double.parseDouble(price);
        quantity=Integer.parseInt(qty);
        this.amount=this.price*quantity;
    }
    
    public Item()
    {
        System.out.println("I do nothing");
    }
}


public class TestShoppingCart {
    
    public static void main(String[] args) {
        TestShoppingCart tsc=new TestShoppingCart();
       // Rectangle5[] rect2=rect1.createRectangles(new int[]{50,23,34,45},new int[]{49,12,33,44});
        ShoppingCart sc=tsc.makeCart(new String[]{"Colgate,CP10023,54.50,3"});
        ShoppingCart sc1=tsc.makeCart(new String[]{"CadBury,CB10004,25.2,2"});
        //ShoppingCart sc1=tsc.makeCart(args)
               System.out.println("Product name:"+sc.items[0].name+" Total Amount:"+sc.totalAmount);
               System.out.println("Product name:"+sc1.items[0].name+" Total Amount:"+sc1.totalAmount);
               
               //System.out.println(sc.items[0].price);
               //Item it=new Item();
               
        
    }
    public ShoppingCart makeCart(String[] itemData)
    {
        ShoppingCart sc=new ShoppingCart();
        sc.items=new Item[itemData.length];
        sc.totalAmount=0;
        for(int i=0; i<itemData.length;i++)
        {
            String data=itemData[i];
            String sd[]=data.split(",");
            Item it=new Item(sd[0], sd[1], sd[2], sd[3]);
            sc.items[i]=it;
            sc.totalAmount=sc.totalAmount+it.amount;
        }
        return sc;
    }
}
