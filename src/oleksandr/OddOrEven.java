package oleksandr;

public class OddOrEven {

    public static void main(String[] args) {

        identify(4);


    }

    public static void identify(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }
    }
}

/*
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */