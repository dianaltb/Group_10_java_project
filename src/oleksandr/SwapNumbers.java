package oleksandr;

public class SwapNumbers {
    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 20;

        num2 = num2 - num1;
        num1 = num1 + num2;

        System.out.println("num1 = " + num1); // 20
        System.out.println("num2 = " + num2); // 10


        // EXTRA TASK: Swap two numbers using temp variable

        int number1 = 10;
        int number2 = 20;

        int temp;

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("number1 = " + number1); // 20
        System.out.println("number2 = " + number2); // 10

    }
}