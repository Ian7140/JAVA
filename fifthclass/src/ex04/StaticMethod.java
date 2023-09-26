package ex04;

class A {
    //instance method
    void abc() {
        System.out.println("instance_method");
    }

    //static method
    static void bcd() {
        System.out.println("static_method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        //How to use instance method - MUST CREATE object
        A a1 = new A();
        a1.abc();

        //How to use static method - Can use Class name DIRECTLY
        A a2 = new A();
        a2.bcd();
    }
}
//-> In static method, ONLY static field exists.
