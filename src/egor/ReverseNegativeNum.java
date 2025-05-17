package egor;

import java.util.Random;

public class ReverseNegativeNum {
    public static void main(String[] args) {

        int num = new Random().nextInt(10) - 500;
        System.out.print("Before reverse: " + num + "\n");
        System.out.println("==============");
        int reversed = reverseNum(num);
        System.out.print("After reverse: " + reversed);
        /*
        Before reverse: -491
        ==============
        After reverse: -194
         */
    }

    private static int reverseNum(int num){
        StringBuilder builder = new StringBuilder(String.valueOf(num).substring(1));
        return Integer.parseInt("-" + builder.reverse());
    }
}
