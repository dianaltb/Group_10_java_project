package shemsiye;

public class SwapNumbers {
    //    SWAP NUMBERS
//    Swap 2 numbers without creating a 3rd variable
    public static void main(String[] args) {
      swapNumbers(5,9);


    }
    public static void swapNumbers(int num1, int num2){
            num1 = num2 + num1;
            num2 = num1 - num2;
            num1 = num1 - num2;
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        }
}


