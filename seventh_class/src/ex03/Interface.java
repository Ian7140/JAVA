package ex03;


// ABSTRACT CLASS INCLUDES MORE THAN ONE OF ABSTRACT METHOD
// EVERY METHOD SHOULD BE ABSTRACT IN INTERFACE

interface A
{
    abstract void abc();
}
interface B
{
    abstract void bcd();
}


class C
{
    void abc() {};
}
class D extends C {}// YOU CAN CHOOSE TO OVERRIDE OR NOT.

class E implements A
{
    @Override
    public void abc()
    {
        System.out.println("LIKE THIS, CLASS THAT INHERITED INTERFACE ");
    }
}

abstract class F implements B {}

class G extends F
{
    @Override
    public void bcd() {
        System.out.println("SOME 'SON' OVERRODE THE ABSTRACT METHOD");
    }
}

// IF I INHERITED AN ABSTRACT METHOD, I SHOULD OVERRIDE IT.
// THE REASON : NORMAL CLASS CAN'T HAVE ABSTRACT METHOD
// IF YOU DON'T WANT TO OVERRIDE IT, HAND IT OVER TO THE 'SON'! THEN YOU SHOULD CHANGE IT INTO ABSTRACT CLASS
public class Interface
{
    public static void main(String[] args) {

    }
}
