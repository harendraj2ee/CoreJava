package com.collection.jPont;

class A{ 
	void m2(){System.out.println("jjjjjjjjjjjjjjjjjjj");}
void m(){System.out.println("hello m");}  
void n(){  
System.out.println("hello n");  
//m();//same as this.m()  
this.m(); 
this.m2();
}  
}  
class TestThis44{  
public static void main(String args[]){  
A a=new A();  
a.n();  
}}  