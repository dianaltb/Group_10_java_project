package mahim;

public class SwapNums {
    /*
    SWAP NUMBERS
Swap 2 numbers without creating a 3rd variable
     */

    public static void main(String[] args) {
        int a=5;
        int b=3;

        // Swap without a third variable

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("====================");

        swapWithoutTempVar(8,10);
        System.out.println("====================");
        swapWithTempVar(-11,0);

    }

    public static void swapWithoutTempVar(int num1, int num2) {
        System.out.println("Before swap num1 = " + num1);
        System.out.println("Before swap num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap num1 = " + num1);
        System.out.println("After swap num2 = " + num2);

    }

    public static void swapWithTempVar(int x, int y){
        System.out.println("Before swap x = " + x);
        System.out.println("Before swap y = " + y);
        int z=x;
        x=y;
        y=z;
        System.out.println("After swap x = " + x);
        System.out.println("After swap y = " + y);
    }
}
