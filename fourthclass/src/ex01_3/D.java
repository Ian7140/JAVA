package ex01_3;

import ex01_1.A;

//D exteds A를 했다는 것은 A가 부모클래스, D가 자식클래스로 사용한다는 의미이다.
//D가 A의 자식이 될 때, A의 필드 메서드가 D에 모두 복사된다.
//자식 클래스에서는 public과 더불어 protected까지 사용가능하다.
public class D extends A
{
   public void print()
   {
       A a = new A();
       System.out.print(a + " ");
       System.out.print(b + " ");
       //System.out.print(c + " ");
       //System.out.print(d + " ");
       System.out.println();
   }

}
