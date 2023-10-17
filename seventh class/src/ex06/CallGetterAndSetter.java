package ex06;

public class CallGetterAndSetter
{
    public static void main(String[] args) {
        ToString a = new ToString();
        System.out.println();
        a.setM(4);
        System.out.println(a.getM());
        // YOU CAN'T APPROACH TO 'A' DIRECTLY ( => must be 'get' or 'set')
        a.setN(5);
        System.out.println(a.getN());

        System.out.println(a.toString());
    }
}
