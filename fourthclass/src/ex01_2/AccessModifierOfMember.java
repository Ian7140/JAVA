package ex01_2;

import ex01_1.A;
import ex01_1.B;
import ex01_3.C;
import ex01_3.D;

public class AccessModifierOfMember
{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();

    }
}
