package ex05;

class A
{
    void abc()
    {
        System.out.println("abc of Class A");
    }
}

class B extends A
{
    //SUPER can retrieve PARENT's original one.
    void bcd()
    {
        // What SUPER means : PARENT
        super.abc();
    }
    @Override
    void abc() {
        System.out.println("abc of Class B");
    }
}
public class SuperKeyword
{
    public static void main(String[] args)
    {
        B bb = new B();
        bb.abc();
    }
}
