package oleksandr;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println("reverseNumber(-125) = " + reverseNumber(-125));
        System.out.println("reverseNumber(125) = " + reverseNumber(125));

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