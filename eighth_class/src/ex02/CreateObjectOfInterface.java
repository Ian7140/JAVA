package ex02;

interface A
{
    int a=3;
    void abc(); // Abstract method
}

// if you don't want to define class B...
// YOU CAN MAKE NEW OBJECT WITHOUT DEFINING IT
class B implements A
{
    @Override
    public void abc()
    {
        System.out.println("B Overriding completed");
    }
}

public class CreateObjectOfInterface
{
    public static void main(String[] args)
    {
        //A a1 = new A(); //Interface can't make an object using 'new' directly
        A a1 = new A()
        {
            @Override
            public void abc()
            {
                System.out.println("You can also print here");
            }
        };
        A b1 = new B();
        A c1 = new B();
        A d1 = new B();
        // YOU CAN DEFINE THE CLASS ONLY ONCE
        System.out.println(a1.a);
        a1.abc();
    }
}
