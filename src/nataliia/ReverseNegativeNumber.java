package nataliia;

public class ReverseNegativeNumber {

    /*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
 */


    public static void main(String[] args) {

        int number = -125;
        int result = reverseNegativeNumber(number);
        int result2 = reverseNegativeNumber2(number);
        System.out.println("Reversed number with loop method: " + result);
        System.out.println("Reversed number with StringBuilder method : " + result2);
    }


    //Method 1 (loop)
    public static int reverseNegativeNumber(int number) {

        if (number >= 0) {
            return number;
        }

        int positive = -number;  // Make it positive for easy handling
        int reversed = 0;

        // Loop to reverse digits
        while (positive > 0) {
            int lastDigit = positive % 10;           // Getting the last digit
            reversed = reversed * 10 + lastDigit;    // Adding to reversed number
            positive = positive / 10;                // Removing the last digit
        }

        return -reversed;
    }

    //Method 2 (StringBuilder)
    public static int reverseNegativeNumber2(int number) {


        if (number < 0) {  // Check if the number is negative

            // Convert negative num to positive using "-number"
            //Then convert num to String
            //Reverse String by using StringBuilder
            String reversed = new StringBuilder(Integer.toString(-number)).reverse().toString();

            // Convert the reversed String to Integer and make negative again
            int reversedNumber = Integer.parseInt(reversed);
            return -reversedNumber;
        }
        return number;

    }

}






