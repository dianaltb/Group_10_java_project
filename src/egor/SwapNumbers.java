package egor;

public class SwapNumbers {
    public static void main(String[] args) {
        swapWithout(5, 10);
        System.out.println("=============");
        swapWithTemp(10, 5);
        /*
        Before swapping:
        First: 5
        Second: 10
        After swapping:
        First: 10
        Second: 5
        =============
        Before swapping:
        First: 10
        Second: 5
        After swapping:
        First: 5
        Second: 10
         */
    }

    public static void swapWithTemp(int first, int second){
        System.out.println("Before swapping: ");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        int temp = first;
        first = second;
        second = temp;
        System.out.println("After swapping: ");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
    public static void swapWithout(int first, int second){
        System.out.println("Before swapping: ");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("After swapping: ");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}
