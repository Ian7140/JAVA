package ex02;

//How to do EXCEPTION : USE 'TRY-CATCH-FINALLY'!
//try{} : A space that has a value which can have an exception
//catch{} : If an EXCEPTION actually happened in try{}, usually used to take the resources back
//finally{} : A space you should write same sentences in try{}, catch{}
public class ExceptionHandler
{
    public static void main(String[] args) {
        try
        {
            System.out.println(3/0);
        }

        catch (ArithmeticException e)
        {
            System.out.println("You can't use 0");
        }

        finally {
            System.out.println("Program Over");
        }

        //parseInt : String -> Num
        try
        {
            int num = Integer.parseInt("10A");
            System.out.println(num);
        }

        catch (ArithmeticException ignored)
        {
            System.out.println("");
        }
    }
}
