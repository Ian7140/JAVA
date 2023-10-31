package ex02;

// Abstract class : IF A SINGLE METHOD IS ABSTRACT, THE CLASS SHOULD BE DEFINED AS 'ABSTRACT CLASS'
// Abstract method : METHOD THAT ITS ROLE IS NOT DEFINED
// SOME 'SON' SHOULD DEFINE BY INHERITING

abstract class Animal
{
    abstract void cry();
    // THIS DOESN'T MEAN THAT 'CRY' METHOD IS NOT COMPLETED
    // THIS FELLA DOESN'T HAVE ITS ROLE. THAT'S IT.

}

class cat extends Animal
{
    @Override
    void cry()
    {
        System.out.println("meow");
    }
}

class dog extends Animal
{
    @Override
    void cry()
    {
        System.out.println("wulf");
    }
}


public class AbstractModifier
{
    public static void main(String[] args)
    {
        Animal cat = new cat();
        cat.cry();
        Animal dog = new dog();
        dog.cry();
    }
}
