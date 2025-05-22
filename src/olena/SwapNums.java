package olena;

public class SwapNums {
    public static void main(String[] args) {
        swapValues(10,5);
        swapWithTemp(30,20);
    }

    public static void swapValues(int num1, int num2){
        System.out.println("Numbers before swapping : num1 =  "+  num1 +" ,num2 = "+ num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Numbers after swapping : num1 =  "+  num1 +" ,num2 = "+ num2);

    }

    public static void swapWithTemp(int num, int num1){

        System.out.println("Numbers before swapping : num =  "+  num +" ,num1 = "+ num1);

        int temp = 0;
        temp = num;
        num = num1;
        num1 = temp;

        System.out.println("Numbers before swapping : num =  "+  num +" ,num1 = "+ num1);
    }


}
