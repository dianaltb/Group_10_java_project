package niloo;

public class SwapNumbers {
    //Swap 2 numbers without creating a 3rd variable

    public static void main(String[] args) {

       swapNums(10,30);

    }

    public static void swapNums(int num1, int num2){

        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        num1 = num1+num2; // num1 = 10+30 = 40
        num2 = num1-num2; // num2 = 40 - 30 = 10
        num1 = num1-num2; // num1 = 40 - 10 = 30
        System.out.println("after swap: "+ "num1 = " + num1 + ", num2 = " + num2 );
    }
}
