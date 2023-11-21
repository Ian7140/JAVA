package ex02;

import java.io.InputStream;
import java.io.InputStreamReader;

public class TryCatchFinally
{
    public static void main(String[] args)
    {
        try
        {
            Thread.sleep(1000); // Delay 1s (high risk of exception)
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        try {
            Class cls = Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        InputStreamReader in = new InputStreamReader(System.in); // Enter the value with KEYBOARD!

    }
}
