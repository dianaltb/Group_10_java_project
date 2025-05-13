package shaista;

public class SwapTwoNumbersWith3rdNum {

    public static void main(String[] args) {

        swapTwoNumbersWith3rdNum(10, 3);
        swapTwoNumbersWith3rdNum(-5, 2);
    }

    public static void swapTwoNumbersWith3rdNum (int num1, int num2) {
        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);

        int num3 = num1;
         num1 = num2;
        num2 = num3;

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
    }


}
