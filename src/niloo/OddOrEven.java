package niloo;

public class OddOrEven {

    /*
Task:Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */


    // identify(int num) method:
    public static void identify(int num) {
        if (num % 2 == 1) {
            System.out.println("\"Odd\"");
        } else {
            System.out.println("\"Even\"");
        }
    }

    public static void main(String[] args) {
        identify(6);
        identify(5);

    }
}
