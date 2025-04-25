package diana;

public class OddOrEven {
    public static void main(String[] args) {
identify(4);
identify(5);

    }
    public static void identify(int n){
        if (n%2==0){
            System.out.println(n+ " is even number");
        }else{
            System.out.println(n+" is odd number");
        }
    }
}
/*
Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */