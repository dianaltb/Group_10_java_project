package shemsiye;

public class SwapNumbers {
    //    SWAP NUMBERS
//    Swap 2 numbers without creating a 3rd variable
    public static void main(String[] args) {
        System.out.println("Swap numbers");
        swapNumbers(5, 9);
        System.out.println("---------------------------");

        System.out.println("Swap using temporary value");
        swapUsingTempValue(1, 39);

    }

    public static void swapNumbers(int num1, int num2) {
        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    //Swap using temporary value
    public static void swapUsingTempValue(int a, int b) {
        int tempValue = a;
        a = b;
        b = tempValue;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}


