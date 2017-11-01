
package harendra;

public class Method {

    public static void main(String[] args) {
        sayHello();
        sayHello();
        sayHello();
        sayString("Harendra");
        sayString("Raju");
        int x = returnSix(6);
        System.out.println(x);
        //fun int x*x;
        int result = squre(x);
        System.out.println(result);

    }

    static int squre(int x) {
        return x * x;
    }

    static int returnSix(int x) {
        return 6;
    }

    static void sayString(String name) {
        System.out.println("Hello, " + name);
    }

    static void sayHello() {
        System.out.println("hello world");
    }
}