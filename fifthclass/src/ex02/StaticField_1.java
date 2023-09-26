package ex02;

class A {
    //There are two types of Field : instance field , static field

    //instance field
    int m = 3;

    //static field
    static int n = 5;
}

public class StaticField_1 {
    public static void main(String[] args) {
        /* A a1 = new A();
        //How to use instance field - MUST CREATE OBJECT by using 'new A()'!
        System.out.println(a1.m);
        //How to use static field - Don't have to make an object. But IT CAN BE USED DIRECTLY
        System.out.println(A.n);*/

        //It's okay to use static field by making object. BUT DON'T PREFER
        //Prefer : System.out.println(A.n); <- this kind of type
        A a2 = new A();
        System.out.println(a2.n);
    }
}
