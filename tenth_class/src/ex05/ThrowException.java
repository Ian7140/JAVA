package ex05;

class A
{
    void abc() throws InterruptedException {
        bcd();
    }

    void bcd() throws InterruptedException { //throw
        Thread.sleep(1000);
    }

//    void bcd()
//    {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
// try-catch
}
public class ThrowException
{
    public static void main(String[] args)
    {
        // try-catch
        // throws
    }
}
