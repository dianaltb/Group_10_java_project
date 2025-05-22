package shaista;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println("The number 5 is " + identifyOdd(5));
        System.out.println("The number 6 is " + identifyOdd(6));
    }

    public static String identifyOdd(int number ){

        if(number % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
