package diana;

public class SwapTwoNumWith3rdVariable {
    public static void main(String[] args) {
        swapTwoNumWith3rdNum(5, 10);
        swapTwoNumWith3rdNum(-3,10);
    }

    public static void swapTwoNumWith3rdNum(int num1, int num2) {
        System.out.println("Before swapping: num1 = " + num1 + " and num2 = " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After swapping: num1 = " + num1 + " and num2 = " + num2);

    }
}
