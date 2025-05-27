package diana;

import javax.swing.*;
import java.util.Scanner;


public class ReverseNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter negative number:");
        int num = scanner.nextInt();
        System.out.println(reverseNegativeNumber(num));
        System.out.println(reverseNegativeNum(num));

    }

    //method with StringBuilder
    public static int reverseNegativeNumber(int num) {
        String num1 = Integer.toString(-num);
        StringBuilder temp = new StringBuilder(num1);
        return -Integer.parseInt(temp.reverse().toString());
    }

    //method with digits
    public static int reverseNegativeNum(int num) {
        int reversed = 0;
        num = -num;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return -reversed;
    }
}
/*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
 */