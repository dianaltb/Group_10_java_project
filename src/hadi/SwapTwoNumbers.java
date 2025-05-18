package hadi;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 12;
        int b = 45;
        System.out.println("Original nubers: "+a+", "+b);
        swap(a, b);

    }

    public static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped numbers: "+a + ", "+b);
    }
}
