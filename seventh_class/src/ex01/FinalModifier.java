package ex01;
// you can use final in front of FIELD, METHOD, CLASS
// final field must be saved when it's first defined and can't be changed
// the SON can't OVERRIDE the final method
// final class can't be INHERITED from the other class

class A
{
    int a = 3;
    final int b = 5;
    void abc() {};
    final void bcd() {};
}

class B extends A
{
    //void bcd() {}; IN FINAL METHOD, THE SON IS NOT ALLOWED TO OVERRIDE
}

final class C{}

//class D extends C{} FINAL CLASS IS NOW ALLOWED TO INHERIT
public class FinalModifier
{
    public static void main(String[] args) {
        A a = new A();
        a.a = 10;
        //a.b = 20 FINAL CAN'T BE CHANGED EVEN THOUGH IT'S SAME
    }

}
