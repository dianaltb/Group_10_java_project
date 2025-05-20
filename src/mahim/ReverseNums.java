package mahim;

public class ReverseNums {
    /*
    Number -- Reverse negative number
    Write a return method that can reverse negative number and return it as int
    Sample: number= -125
    result= -521
    */

    public static void main(String[] args) {

        System.out.println("reversedNum(986) = " + reversedNum(-125));
        System.out.println("reversedNum(-987) = " + reversedNum(-987));
        System.out.println("reversedNum(1200) = " + reversedNum(1209));
    }

    public static int reversedNum(int number) {
        StringBuilder reversedNumber = new StringBuilder();
        String revNumAsStr = String.valueOf(number);


        for (int i = revNumAsStr.length() - 1; i >= 0; i--) {
            char ch = revNumAsStr.charAt(i);
            if (ch != '-') {
                reversedNumber.append(ch);
            }
        }
        if (revNumAsStr.contains("-")) {
            reversedNumber.insert(0, '-');
        }
        return Integer.parseInt(reversedNumber.toString());
    }

}
