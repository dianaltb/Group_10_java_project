package egor;

public class FINRA {
    public static void main(String[] args) {

        printFinRa();
        //1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA
        // 16 17 FIN 19 RA FIN 22 23 FIN RA 26 FIN 28 29 FINRA
    }

    private static void printFinRa(){
        for (int i = 1; i <= 30 ; i++) {
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
