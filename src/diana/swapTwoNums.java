package diana;

public class swapTwoNums {
    public static void main(String[] args) {
        //Swap 2 numbers without creating a 3rd variable
        swapTwoNumbers(5,10);
        swapTwoNumbers(-3,10);
    }
    public static void swapTwoNumbers( int num1, int num2){
        System.out.println("Before swapping: "+num1+" and "+num2);
        num1=num1+num2;//5+10=15
        num2=num1-num2;//15-10 =5
        num1=num1-num2;//15-5=10
        System.out.println("After swapping: "+num1+ " and "+num2);

    }
}
