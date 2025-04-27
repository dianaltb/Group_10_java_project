package niloo;

/* Task: Write  a method which can identify given number is even or odd
  Output ex:
  identify(5); ->"Odd"
  identify(6); ->"Even"
   */
public class OddOrEven {

    // creating identify() method with void return type:
    public static void identify(int num) {

        if (num % 2 == 1) {
            System.out.println("\"" + "Odd" + "\"");
        } else {
            System.out.println("\"" + "Even" + "\"");
        }
    }

    public static void main(String[] args) {

        identify(5);
        identify(6);

    }
}

