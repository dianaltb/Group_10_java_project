package roman;

public class EvenOrOdd {

    //This method prints provided parameter number is Even or Odd
    public static void identify(int num) {
        System.out.println( num% 2 == 0 ? num + " is Even number" : num + " is Odd number");
    }


    public static void main(String[] args) {
        identify(2);
    }
}
