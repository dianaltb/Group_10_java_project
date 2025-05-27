package egor;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static String frequency_of_chars(String str){

        String temp = "";


        for (int i = 0; i < str.length(); i++){
            int cont = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    cont++;
                }
            }

            if (!temp.contains(str.charAt(i) + "")) {
                temp += "" + str.charAt(i) + cont;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(frequency_of_chars("AAABBCDD"));
    }
}
