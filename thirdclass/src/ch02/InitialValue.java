package ch02;

class A
{
    //다양한 필드 정의 (초기화는 안 시켰음. 어떤 값이 들어있을까)
    boolean m1;
    int m2;
    double m3;
    String m4;

    //초기화를 시키지 않은 변수들을 출력
    void printFieldValue()
    {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVariable()
    {
        //필드가 아니라 지역변수
        int k = 10;
        System.out.println(k);
    }
}

public class InitialValue {
    public static void main(String[] args)
    {
        A a = new A();
        a.printFieldValue();
        //출력은 잘 되는 것으로 보아
        //필드는 컴파일러가 자동으로 초기화 시켜준다는 것을 알 수 있음
        a.printLocalVariable();
        //지역변수는 필드와 다르게 초기화를 해야 출력이 가능하다
    }
}
