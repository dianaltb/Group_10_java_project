package hadi;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        //Number -- Reverse negative number
        //Write a return method that can reverse negative number and return it as int
        //
        //Sample: number= -125
        //        result= -521

        int num = -125;
        System.out.println(reverse(num));
        System.out.println(reverseNegativeNumber(num));

    }

    public static int reverse(int num){

        if (num >= 0) return num;
        String numberStr = Integer.toString(num).substring(1);
        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        return -Integer.parseInt(reversedStr);

    }

    public static int reverseNegativeNumber(int n){
        if (n >= 0) return n;

        String reversedStr ="";
        String numString = Integer.toString(n).substring(1);
        for (int i = numString.length()-1; i >= 0; i--) {
            reversedStr += numString.charAt(i);
        }

        return -Integer.parseInt(reversedStr);
    }
}
