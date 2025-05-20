package shaista;
/*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
 */

public class ReverseNegativeNumber {


    public static int reverseNegativeNumber(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Number must be negative");
        }

        int reversed = 0;
        num = -num;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            //check for overflow
            if (reversed > Integer.MAX_VALUE / 10) {
                throw new ArithmeticException("Reverse number overflows int.");
            }
            reversed = reversed * 10 + digit;
        }
        return -reversed; // Return the reversed number as negative


    }

    public static void main(String[] args) {

        int input = -125;
        int reversed = reverseNegativeNumber(input);
        System.out.println("Reversed number: " + reversed); // Output: -452
    }
}
