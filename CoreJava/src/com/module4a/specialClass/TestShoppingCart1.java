/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.module4a.specialClass;

/**
 *
 * @author Home
 */

class ShoppingCart1
{
    Item1[] items;
    double totalAmount;
    
    public void addItem(Item1 it)
    {
        if(items!=null && items.length!=0)
        {
            //for(this.items:currItem)
            {
                
            }
            
        }
        else
        {
            items=new Item1[1];
            items[0]=it;
        }
    }
}

class Item1
{
    String name;
    String productId;
    double price;
    int quantity;
    double amount;
    
    public boolean equals(Item1 it)
    {
        return(this.productId.equals(it.productId));
    }
    
    public Item1(String name, String pid, String price, String qty)
    {
        this.name=name;
        productId=pid;
        this.price=Double.parseDouble(price);
        quantity=Integer.parseInt(qty);
        this.amount=this.price*quantity;
    }
    
    public Item1()
    {
        System.out.println("I do nothing");
    }
}


public class TestShoppingCart1 {
    
    public static void main(String[] args) {
        TestShoppingCart1 tsc=new TestShoppingCart1();
       // Rectangle5[] rect2=rect1.createRectangles(new int[]{50,23,34,45},new int[]{49,12,33,44});
        ShoppingCart1 sc=tsc.makeCart(new String[]{"Colgate,CP10023,54.50,3"});
        ShoppingCart1 sc1=tsc.makeCart(new String[]{"CadBury,CB10004,25.2,2"});
        //ShoppingCart sc1=tsc.makeCart(args)
               System.out.println("Product name:"+sc.items[0].name+" Total Amount:"+sc.totalAmount);
               System.out.println("Product name:"+sc1.items[0].name+" Total Amount:"+sc1.totalAmount);
               
               //System.out.println(sc.items[0].price);
               //Item it=new Item();
               
        
    }
    public ShoppingCart1 makeCart(String[] itemData)
    {
        ShoppingCart1 sc=new ShoppingCart1();
        //sc.items=new Item[itemData.length];
        sc.totalAmount=0;
        for(int i=0; i<itemData.length;i++)
        {
            String data=itemData[i];
            String sd[]=data.split(",");
            Item it=new Item(sd[0], sd[1], sd[2], sd[3]);
           // sc.items[i]=it;
            sc.totalAmount=sc.totalAmount+it.amount;
        }
        return sc;
    }
}
