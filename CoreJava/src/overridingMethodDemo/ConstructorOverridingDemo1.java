/*
 Write a program Constructor Overriding 
 */
package overridingMethodDemo;

class D1 {

    public void D1(int i) {
        System.out.println("Welcome to 1st Constructor Overriding method is : " + i);
    }
}
class D2 extends D1 {

    public void D2(int j) {
        System.out.println("Welcome to 2nd Constructor Overriding method is : " + j);
    }
}
/* class D3 extends D2
 {
 public void D3(int k)
 {
 System.out.println("Welcome to 3rd Constructor Overriding method is : "+k);
 }
 }
 */
class D3 extends D1 {

    public void D3(int k) {
        System.out.println("Welcome to 3rd Constructor Overriding method is : " + k);
    }
}
class D4 extends D1 {

    public void D4(int l) {
        System.out.println("Welcome to 4th Constructor Overriding method is : " + l);
    }
}
public class ConstructorOverridingDemo1 {

    public static void main(String[] args) {
        D1 obj1 = new D1();
        obj1.D1(20);

        D2 obj2 = new D2();
        obj2.D2(30);

        D3 obj3 = new D3();
        obj3.D3(40);

        D4 obj4 = new D4();
        obj4.D4(50);
    }
}
