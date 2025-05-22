package kseniia;

public class OddOrEven {

    public static void main(String[] args) {
        identify(6);
        identify(5);

        }

        public static void identify(int num) {

            if (num % 2 == 0) {
                System.out.println(num + " is the even number");
            } else {
                System.out.println(num + " is an odd number");
            }
        }
    }



