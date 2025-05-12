package roman;

public class SwapNumers {
    public static void main(String[] args) {

        //Swap 2 numbers without creating a 3rd variable

        int num1 = 3;
        int num2 = 7;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);

    }
}
