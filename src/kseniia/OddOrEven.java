package kseniia;

public class OddOrEven {

    public static String identify(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

        public static void main (String[]args){

            System.out.println("\"" + identify(5) + "\"");
            System.out.println("\"" + identify(6) + "\"");
        }
    }


