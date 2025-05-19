package niloo;

public class ReverseNegativeNum {
    /*
    Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int
Sample: number= -125
        result= -521
     */

    public static void main(String[] args) {
        reverseNegativeNum(-1234);
        reverseNegativeNum(-125);
        reverseNegative(-345);
    }
    // method 1:
    public static int reverseNegativeNum(int num) {
        String stringNum = "" + num;
        String reversedNum = "";
        for (int i = stringNum.length() - 1; i > 0; i--) {
            reversedNum += stringNum.charAt(i);
        }
        int result = -(Integer.parseInt(reversedNum));
        System.out.println("reversedNum = " + result);
        return result;
    }

    // method 2:
    public static int reverseNegative(int number) {
        if (number >= 0) {
            throw new IllegalArgumentException("Input must be a negative number.");
        }else {
            // Removing the negative sign and converting to string
            String numStr = Integer.toString(Math.abs(number));
            // Using StringBuilder to reverse
            StringBuilder sb = new StringBuilder(numStr);
            String reversedStr = sb.reverse().toString();
            // Converting back to int and adding negative sign
            int finalResult = -Integer.parseInt(reversedStr);
            System.out.println("reversedNum = " + finalResult);
            return finalResult;
        }
    }

}
