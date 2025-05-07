package olena;

public class Finra {

    public static void main(String[] args) {
        finra(30);
    }
    public static void finra(int num) {

        for (int i = 1; i <= num; i++) {
                System.out.print(" ");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN");
            } else if (i % 5 == 0) {
                System.out.print("RA");
            } else {
                System.out.print(i);
            }
        }
    }
}
