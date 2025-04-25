package niloo;

/*  Write  a method which can identify given number is even or odd
  Output ex:
  identify(5); ->"Odd"
  identify(6); ->"Even"
   */
public class OddOrEven {

    public static String identify(int num) {
        if (num % 2 == 1) {
            return "Odd";
        } else {
            return "Even";
        }
    }

    public static void main(String[] args) {

        System.out.println("\"" + identify(5) + "\"");
        System.out.println("\"" + identify(6) + "\"");
    }
}

