package ex05;

class A {
    int a;
    static int b;

    //CONSTRUCTOR usually RESETS instance field.
    //static field can reset from constructor either. BUT DO NOT PREFER!
    A(int a) {
        this.a = a;
    }
    //->
    //It resets static field in STATIC BLOCK.
    static {
        b = 7;
    }
}

public class StaticInitialBlock {
    public static void main(String[] args) {
        A a1 = new A(3); //constructor
        System.out.println(a1.a);
        System.out.println(a1.b);
    }
}
