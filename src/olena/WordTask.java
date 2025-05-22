package olena;

import java.util.HashMap;
import java.util.Map;

public class WordTask {
    public static void main(String[] args) {
        //  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        System.out.println(word("AAABBCDD"));
    }

    public static String word(String input) {

        Map<Character, Integer> letterCount = new HashMap<>();
        for (char letter : input.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }
        String result = "";
        for (char key : letterCount.keySet()) {
            result = result + key + letterCount.get(key);

        }
        return result;
    }




    }

