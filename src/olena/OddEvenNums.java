package olena;

public class OddEvenNums {
    public static void main(String[] args) {
       oddEven(13);

    }
    public static void oddEven ( int num){

        if ( num % 2 == 0){
            System.out.println(num+" is the even number");
        }else{
            System.out.println(num+" is an odd number");
        }
    }
}
