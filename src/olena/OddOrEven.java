package olena;

public class OddOrEven {

    public static void main(String[] args) {
        identify(6);
        identify(5);


    }

    public static String identify(int num) {

        if (num % 2 == 0)
            return num + " is the even number";
        return num + " is an odd number";
    }
}


