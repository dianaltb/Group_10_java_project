package rasha;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        int num = -125;
        System.out.println(numReverse(num));
    }

    private static int numReverse(int num) {

        num = Math.abs(num);
        String number = String.valueOf(num);
        StringBuilder sbNumber = new StringBuilder(number);
        sbNumber.reverse();
        String numChang = "-" + sbNumber;
        return Integer.parseInt(numChang);
    }
}

