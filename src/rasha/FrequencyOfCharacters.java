package rasha;

/*
 Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";

        System.out.println("frequencyOfChars(str) = " + frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (char each : str.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            sb.append(entry.getKey()).append(entry.getValue());

        }

        return sb.toString();
        
    }

}
