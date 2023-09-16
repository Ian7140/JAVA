package ch06;

public class MethodOverLoading
{
    public static void main(String[] args)
    {
        print();
    }
    public static void print()
    {
        System.out.println("데이터가 없습니다.");
    }

    public static void print(int a)
    {
        System.out.println("1234");
    }

    public static void print(double a)
    {
        System.out.println("5678");
    }

    //바로 위의 것과 메서드 시그니처가 똑같기 때문에 정의할 수 없다.
//    public static void print(double a)
//    {
//        System.out.println("5678");
//    }

    public static void print(int a,int b)
    {
        System.out.println("1234");
    }

    //메서드 시그니처가 다르다는 것은 이름은 똑같지만 매개변수의 종류나 개수가 다름을 의미

//    public static int print(int a,int b)
//    {
//        System.out.println("1234");
//        return a;
//    }
    //반환형이 다르다는 것은 호출할 때 헷갈리기 때문에 시그니처가 같다라고 할 수 있다.
}
