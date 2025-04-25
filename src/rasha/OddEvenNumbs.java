package rasha;

public class OddEvenNumbs {
    public static void main(String[] args) {
        identify(5);
        identify(6);
    }

 public static void identify(int number) {
     if (number % 2 == 0) {
         System.out.println(number + " is Even");
     } else {
         System.out.println(number + " is Odd");
     }
 }
}

