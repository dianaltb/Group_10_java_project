package kseniia;
/*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
 */



public class ReverseNegativeNumber {
    public static int reverseNegative(int number) {
        boolean isNegative = number < 0;
        int n = Math.abs(number);
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        return isNegative ? -reversed : reversed;
    }

    public static void main(String[] args) {
        int number = -225;
        int result = reverseNegative(number);
        System.out.println(result);
    }
}
