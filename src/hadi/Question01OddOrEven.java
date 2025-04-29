package hadi;
/*
Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */
public class Question01OddOrEven {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println("another one");
    }

    public static String identify(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
