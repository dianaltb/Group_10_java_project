package oleksandr;

public class Finra {
    public static void main(String[] args) {

        finra(1,30);


    }

    public static void finra(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

