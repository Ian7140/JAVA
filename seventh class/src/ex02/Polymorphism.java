package ex02;

class A
{
}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism
{
    public static void main(String[] args) {

        //Can be A?
        A a1 = new A(); // A is A (O)
        A a2 = new B(); // B is A (O)
        A a3 = new C(); // C is A (O)
        A a4 = new D(); // D is A (O)
        //Can be B?
//      B b1 = new A(); A is B (X)
        B b2 = new B(); // B is B (O)
        B b3 = new C(); // C is B(O)
        B b4 = new D(); // D is B(O)
        //Can be C?
        //C c1 = new A(); // A is C (X)
        //C c2 = new B(); // B is C (X)
        C c3 = new C(); //   C is C (O)
        //C c4 = new D(); // D is C (X)
        //Can be D?
        //D d1 = new A(); // A is D (X)
        //D d2 = new B(); // B is D (X)
        //D d3 = new C(); // C is D (X)
        D d4 = new D(); // D is D (O)
    }
}
