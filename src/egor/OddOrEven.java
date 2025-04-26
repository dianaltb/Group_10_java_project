package egor;

import java.util.Random;

public class OddOrEven {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(50) + 1;

        checker(num);
        //16 is the even number.
    }

    public static void checker(int num){
        System.out.println(num +
                (num % 2 == 0 ? " is the even number." : " is the odd number."));
    }
}
