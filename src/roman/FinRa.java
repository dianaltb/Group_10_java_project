package roman;

public class FinRa {
    //method below will print out the numbers from 1 to 30 but if the number is a multiple of 3, print "FIN" instead of the number and if the number is multiple of 5, print "RA" instead of the number. If the number is a multiple of both 3 and 5, then print "FINRA" instead of the number.
    public static void fin_ra(){
        for (int i = 1; i <= 30; i++){

            System.out.print((i % 3 == 0 && i % 5 ==0) ? "FINRA, " : (i % 3 == 0) ? "FIN, " : (i % 5 == 0) ? "RA, " : i + ", ");

        }
    }

    public static void main(String[] args) {
        fin_ra();
    }
}
