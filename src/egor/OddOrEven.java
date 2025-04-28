package egor;

import java.util.Random;

public class OddOrEven {
    public static void main(String[] args) {
        evenOrOdd(new Random().nextInt(50) + 1);
        //17 is the odd number.
    }

    public static void evenOrOdd(int num){
        System.out.println(num +
                (num % 2 == 0 ? " is the even number." : " is the odd number."));
    }
}
