package rasha;

/*
SWAP NUMBERS
Swap 2 numbers without creating a 3rd variable
 */

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        b = a + b;
        a = b - a;
        b = b - a;


        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
