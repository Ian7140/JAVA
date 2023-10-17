package ex06;


public class ToString
{
    private int m ;
    private int n ;
    //SAFE CODE : use method indirectly to approach field


    // Method that brings the value from m field
    public int getM() {
        // code that qualifies the SAFE USER
        return m;
    }

    // Method that save the value in m field
    public void setM(int m) {
        this.m = m;
    }

    //Method that brings the value from N field
    public int getN() {
        return n;
    }

    // Method that saves the value in N field
    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }

    public static void main(String[] args)
    {
        /*
        A a = new A();
        // HASHCODE is information of location in Memory that object is in
        System.out.printf("%x\n",a.hashCode());
        // toString is common information that shows the object
        // Do we really need HASHCODE by the way?
        System.out.println(a.toString());
         */
    }
}
