package ch07;

import java.util.Arrays;
public class FlexibleSizeArrayArgument
{
    public static void main(String[] args)
    {
        //메서드 오버로딩을 이용해서 동일한 이름의 메서드를 다양하게 호출
        method1(1,2);
        method1(1,2,3);
        method1();

        method2("안녕");
        method2("감사");
        method2();

    }
    //만약 한 개부터 100개까지 있다면
    //총 100가지의 시그니처를 만들어야 하는건가?
    //이러한 이유로 가변길이 배열 매개변수라는 문법이 만들어짐
    public static void method1(int...array)
    {
        for(int k:array)
        {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void method2(String...array)
    {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

}
