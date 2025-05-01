package emanuele;

public class Test {
    /* /*
Task:Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */
    public static void main(String[] args) {
            System.out.println(identifyOddOrEven(6));
            System.out.println(identifyOddOrEven(5));
        }

        public static String identifyOddOrEven(int x){
            String result;
            if (x % 2 == 0) {
                result = "Even";
            } else {
                result = "Odd";
            }
            return result;
        }
    }

