package ex03;

// Class A looks like it doesn't have a PARENT, but when you put 'extends Object'
// It will be the son of OBJECT
class A extends Object
{
    int m = 3;
    void abc() {
        System.out.println("Class A");
    }

    // toString is used to explain the object of the CLASS
    @Override
    public String toString()
    {
        return "I'm Class A";
    }
}
class B extends A
{
    int n = 4;
    void bcd()
    {
        System.out.println("Class B");
    }
    @Override
    void abc() {
        System.out.println("Redefine Class A");
    }

    @Override
    public String toString()
    {
        return "I'm Class B";
    }
}

public class TypeCasting
{
    public static void main(String[] args) {
        //little balloon , point little balloon
        A aa = new A();
        //toString() is a METHOD that inherited by OBJECT
        System.out.println(aa.toString( ));
        System.out.println(aa.m);
        aa.abc();

        // big, small balloon , point little balloon
        A bb = new B();
        System.out.println(bb.toString());
        bb.abc();
        //As bb is pointing the small balloon, you can't use bb.n
        // DOWN-CASTING (= pointing big balloon)
        System.out.println(((B)bb).n);
        ((B)bb).bcd();
        bb.abc();

        //big,small balloon, point big balloon
        B cc = new B();
        System.out.println(cc.m);
        System.out.println(cc.n);

    }
}
