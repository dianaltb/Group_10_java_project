package shaista;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        System.out.println("Before swapping number: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping number: a = " + a + ", b = " + b);



    }
}
