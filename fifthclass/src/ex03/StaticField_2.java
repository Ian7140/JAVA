package ex03;

class A {
    //instance field
    int m = 3;
    //static field
    static int n = 5;
}

public class StaticField_2 {
    public static void main(String[] args) {
        //create 2 objects
        A a1 = new A();
        A a2 = new A();

        //instance field
        a1.m = 5;
        a2.m = 6;

        System.out.println(a1.m);
        System.out.println(a2.m);

        //static field
        a1.n = 7;
        a2.n = 8;
        System.out.println(a1.n);
        System.out.println(a2.n);
    }
}
