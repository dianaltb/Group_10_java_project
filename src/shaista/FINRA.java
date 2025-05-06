package shaista;

public class FINRA {

    public static void main(String[] args) {

        printFINRA(1,30);

    }

    public static void printFINRA(int start, int end){
        for (int i = start; i <= end ; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FINRA");
            }else if(i % 3 ==0){
                System.out.print("FIN");
            }else if(i % 5 == 0){
                System.out.print("RA");
            }else{
                System.out.print(i + " ");
            }
        }
    }



}
