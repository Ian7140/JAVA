package ex07;
//Exception :
//throws
//try-catch

//Exception made by user
//ex -> int age = -1;  Play -> exception (Minus-exception)

class MyException extends Exception{
    public MyException(){
        super(); //parent constructor
    }

    public MyException(String message){
        //where my message I want exists.
        super(message);
    }
}

class A{
    void abc_1(int num) {
        if(num > 70) System.out.println("NO ERROR");
        else try {
            throw new MyException("Should be bigger than 70");
        } catch (MyException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
    void abc_2() {
        abc_1(65);
    }
}
public class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.abc_2();
    }
}
