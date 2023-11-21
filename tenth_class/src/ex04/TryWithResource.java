package ex04;

/*
finally{} : The place where sentences that play very last and have responsibility to be used at the end.
Common type : 'Resource Return'
ex -> Stream, Memory spaces return
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResource
{
    public static void main(String[] args)
    {
        InputStreamReader isr1 = null;
        isr1 = new InputStreamReader(System.in);
        char input = 0;
        try {
            input = (char) isr1.read();
            System.out.println("Input letters : " + input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        finally {
//            //resource returning : retro grammar(?)
//            if(isr1 != null)
//            {
//                try {
//                    isr1.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }


        //resource auto return (current trends)
        //As we CLOSED the stream in finally before, we CAN'T CLOSE it AGAIN
        try(InputStreamReader isr2 = new InputStreamReader(System.in);)
        {
            char input2 = (char) isr2.read();
            System.out.println("Input letters : " + input2);
        }

        catch(IOException e)
        {
            e.printStackTrace(); // Prints the content of exception
        }
    }
}
