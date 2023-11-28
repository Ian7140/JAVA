package ex08;
import java.util.Scanner;

//when integer is less than 0
class  MinusException extends Exception{
    public MinusException(String message){
        super(message);
    }
}
//when score gets bigger than 100
class score_over extends Exception{
    public score_over(){
        super();
    }
    public score_over(String message){
        super(message);
    }
}
//print 2 exceptions by making A class
class A{
    void check_score(int score) throws score_over, MinusException {
        if(score < 0){
            //which plays Exception : throw (not throws)
            throw new MinusException("MINUS -> ERROR!");
        }
        else if(score > 100){
            throw new score_over("MORE THAN 100 -> ERROR");
        }
        else System.out.println("Normal");
    }
}

public class UserExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("ENTER THE SCORE: ");
                int score = scanner.nextInt();

                if (score > 100) {
                    throw new IllegalArgumentException("ERROR : SHOULD BE LESS THAN 100");
                }
                else if (score < 0) {
                    throw new IllegalArgumentException("ERROR : SHOULD BE MORE THAN 0");
                }

                System.out.println("SCORE -> " + score);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        scanner.close();
    }
}



