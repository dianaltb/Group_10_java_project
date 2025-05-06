package amine;

import java.util.Scanner;

public class oddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eter your number");
        int x = sc.nextInt();
        System.out.println(x);


        System.out.println(oddoreven(x));

    }

    public static String oddoreven(int x){
        String y ;
        if (x%2==0){
            y = "even";
            return "identify("+x+"); ->"+y;
        }else{
            y="odd";
            return  "identify("+x+"); ->"+y;
        }
    }
}
