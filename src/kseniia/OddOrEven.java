package kseniia;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 5;
        String result = "";


        if(num % 2 == 0){
            result = "Number " + num + " is even";
        }else if(num % 2 != 0){
            result = "Number " + num + " is odd";
        }
        System.out.println(result);
    }
}


