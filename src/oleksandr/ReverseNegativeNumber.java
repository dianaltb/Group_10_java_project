package oleksandr;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int positive = 125;
        int negative = -125;

        System.out.println("reverseNumber(positive) = " + reverseNumber(positive));
        System.out.println("reverseNumber(negative) = " + reverseNumber(negative));


    }

    private static int reverseNumber(int number) {

        StringBuilder sb = new StringBuilder(number + "");

        if (number > 0) {
            return Integer.parseInt(sb.reverse().toString());
        } else {
            return -(Integer.parseInt(sb.reverse().toString().replaceAll("-","")));
        }
    }
}