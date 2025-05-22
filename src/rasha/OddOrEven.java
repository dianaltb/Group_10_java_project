package rasha;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(oddOrEven(5));
        System.out.println(oddOrEven(6));

    }

    public static String oddOrEven(int num){
        if (num%2==0){
            return "Even";
        }else {
            return "Odd";
        }

    }

}
