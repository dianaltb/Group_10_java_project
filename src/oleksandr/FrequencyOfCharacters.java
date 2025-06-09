package oleksandr;

import java.util.*;


public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBCDD";

        System.out.println(frequencyOfCharacters(str));

    }

    public static String frequencyOfCharacters(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            sb.append(each.getKey() + "" + each.getValue());
        }

        return sb.toString();
    }
}

