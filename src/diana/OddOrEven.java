package diana;

public class OddOrEven {
    public static void main(String[] args) {
        identify(4);
        identify(5);
    }
    public static void identify(int num){
        if (num%2==0){
            System.out.println(num+ " is even number");
        }else{
            System.out.println(num+" is odd number");
        }
    }
}
