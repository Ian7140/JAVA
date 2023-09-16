package ch08;
//class에는 필드와 메서드뿐만 아니라 생성자라는 것이 존재한다.
//생성자는 new를 통해서 객체 생성을 가능하게 해주는 존재
//필수요소이기 때문에 없어서는 안되며, 개발자가 생성자를 넣지 않았다면 컴파일러가 대신 넣어준다.
class A{
    int m;
    void work() {
        System.out.println(m);
    }
    //이건 생성자(디폴트)이다
    //A()
}

class B{
    int m;
    void work(){
        System.out.println(m);
    }
    //디폴트 생성자를 직접 넣어줌
    //생성자의 이름은 클래스 이름과 반드시 동일해야 함
    B()
    {

    }
}

class C
{
    int m;
    void work()
    {
        System.out.println(m);
    }
    //이런 식으로 매개변수가 들어간 형태의 생성자도 정의할 수 있음.
    //단 이런경우에 컴파일러가 디폴트 생성자를 추가하지 않는다.
    C(int a)
    {
        m = a;
    }
    C()
    {
        
    }
}
public class DefaultConstructor
{
    public static void main(String[] args)
    {
        A a = new A(); // 생성자로 객체 생성하기
        B b = new B();
        C c = new C();
    }
}
