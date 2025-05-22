package kseniia;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 3;
        int b = 2;

        System.out.println("Before swapping numbers: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping numbers: a = " + a + ", b = " + b);



    }
}

   /* SWAP NUMBERS
    Swap 2 numbers without creating a 3rd variable

    */