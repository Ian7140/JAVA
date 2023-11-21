package ex03;

public class MultiCatch
{
    public static void main(String[] args) throws ArithmeticException {
//       try
//       {
//           System.out.println(3/0);
//       }
//       catch(ArithmeticException e)
//       {
//           System.out.println("You can't divide a number with 0 ");
//       }
//        finally
//        {
//            System.out.println("Program Over");
//        }
////        System.out.println(3/0);
//
//        //Integer.parseInt() : Changes the character in () to number
//        try
//        {
//            int num = Integer.parseInt("10A"); //mistakable
//            System.out.println(num);
//        }
//        catch(NumberFormatException e)
//        {
//            System.out.println("You can't change it to NUMBER");
//        }

        try
        {
            System.out.println(3 / 0);
            int num = Integer.parseInt("10A");
            System.out.println(num);
        }
        catch(ArithmeticException | NumberFormatException e) {
            System.out.println("ERROR OCCURRED");
        }
    }
}
