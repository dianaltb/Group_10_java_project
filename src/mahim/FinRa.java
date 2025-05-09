package mahim;

public class FinRa {
    public static void main(String[] args) {

        printFinRa(0, 15);
        System.out.println("======================");
        printFinRa(7,-40);
        System.out.println("======================");
        printFinRa(-9,1);
        System.out.println("======================");
        printFinRa(30,30);

    }

    public static void printFinRa(int start, int end) {
        if (start > end) {
            System.out.println("Invalid input: start must be less than or equal to end.");
            return;
        }
        for (int i = start; i <= end; i++) {
            if(i==0){
                System.out.print("ZERO"+ " ");
            }else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FINRA ");
            } else if (i % 3 == 0) {
                System.out.print(" FIN ");
            } else if (i % 5 == 0) {
                System.out.print(" RA ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();  // Adds line break after each result

    }

}
