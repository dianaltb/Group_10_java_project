package shaista;

public class OddOrEven {

    public static String identify(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }


    public static void main(String[] args) {

        System.out.println("The number 5 is " + identify(5));
        System.out.println("The number 6 is " + identify(6));

    }
}
