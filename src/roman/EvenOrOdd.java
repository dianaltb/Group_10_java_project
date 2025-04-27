package roman;

public class EvenOrOdd {
    //Method below is static method that can be called by class name an accept int parameter, and will print you statement if number is even or odd, if number is less than 1 it will print you err msg and will exit program.
    public static void evenOrOdd(int num){
        if (num < 1){
            System.err.println("Number can't be less than 1");
            System.exit(1);
        }else if (num % 2 == 0){
            System.out.println(num + " is Even");
        }else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {

        evenOrOdd(0);

    }
}
