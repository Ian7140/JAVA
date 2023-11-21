package ex06;


class A
{
    void abc()
    {
        //It's better to collaborate these two catches
        try
        {
            bcd();
        }
        catch(ClassNotFoundException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    void bcd() throws InterruptedException, ClassNotFoundException {
        //If you have two or more things you have to solve, MOSTLY USE THROW!
//        try {
//            Class cls = Class.forName("java.lang.Object");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Class cls = Class.forName("java.lang.Object");
        Thread.sleep(1000);
    }
}
public class ThrowsException_2
{
    public static void main(String[] args)
    {

    }
}
