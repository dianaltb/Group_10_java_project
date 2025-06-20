package diana;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {

        System.out.println(frequenceOfChars("AAABBBBCCCCUUUUTTT"));
    }

    public static String frequenceOfChars(String str) {

        Map<Character, Integer> count = new HashMap<>();
        for (char letter : str.toCharArray()) {
            count.put(letter, count.getOrDefault(letter, 0) + 1);
        }
        String result = "";
        for (char key : count.keySet()) {
            result = result + key + count.get(key);

        }
        return result;
    }
}
/*
      Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */