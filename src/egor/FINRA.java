package egor;

public class FINRA {
    public static void main(String[] args) {

        printFinRa(59);
        //1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA
        // 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
        // 31 32 FIN 34 RA FIN 37 38 FIN RA 41 FIN 43 44 FINRA
        // 46 47 FIN 49 RA FIN 52 53 FIN RA 56 FIN 58 59
    }

    private static void printFinRa(int limit){
        for (int i = 1; i <= limit; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FINRA ");
            } else if(i % 3 == 0){
                System.out.print("FIN ");
            } else if(i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
