package oleksandr;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int positive = 125;
        int negative = -125;

        System.out.println("reverseNumber(positive) = " + reverseNumber(positive));
        System.out.println("reverseNumber(negative) = " + reverseNumber(negative));


    }

    private static int reverseNumber(int number) {
        if (number > 0) {
            StringBuilder sb = new StringBuilder(number + "");
            return Integer.parseInt(sb.reverse().toString());
        } else {
            StringBuilder sb = new StringBuilder(number + "");
            return -(Integer.parseInt(sb.reverse().toString().replaceAll("-","")));
        }
    }
}