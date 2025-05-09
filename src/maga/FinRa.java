package maga;

public class FinRa {
    public static void main(String[] args) {
        finra(25);
        System.out.println("=======================");
        finra2(30);
    }

    public static void finra (int n){
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FinRa");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("Ra");
            } else {
                System.out.println(" " + i);
            }
        }
    }

    public static void finra2 (int n){
        for (int i = 0; i < n; i++) {
            String str = "";

            if(i % 3 == 0){
                str += "Fin";
            }
            if(i % 5 == 0){
                str += "Ra";
            }

            if(str.isEmpty()){
                System.out.println(i);
            }else {
                System.out.println(str);
            }

        }


    }


}
