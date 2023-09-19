package ex01_3;

import ex01_1.A;
public class C extends A
{
    public void print()
    {
        A a = new A();
        //다른 클래스에서는 protected, default,private 모두 사용 불가능하다
        System.out.print(a + " ");
        System.out.print(b + " ");
        //System.out.print(c + " ");
        //System.out.print(d + " ");
        System.out.println();
    }

}
