package ex03;

//interface is a set with unimplemented various skills
interface A
{
    void abc(); //abstract method
    // void bcd(); This guys have responsibility to use every method
    default void bcd()
    {
        System.out.println("A interface : bcd()");
    }
}

class B implements A
{
    @Override
    public void abc()
    {
        System.out.println("B class : abc()");
    }
}

class C implements A
{
    @Override
    public void abc()
    {
        System.out.println("B class : abc()");
    }
}
public class DefaultMethod
{
    public static void main(String[] args)
    {
        A a1 = new B();
        A a2 = new C();

        a1.abc();;
        a1.bcd(); // bcd() is a default method inherited by parents.
        a2.bcd();
        a2.abc();
    }
}
