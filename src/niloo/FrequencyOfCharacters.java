package niloo;

import java.util.HashMap;

/*
Java Question 05 - Frequency of Characters
      Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */
public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDD";
       frequencyOfChars(str);  // result = A3B2C1D2
    }

    public static String frequencyOfChars(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, (frequencyMap.get(ch) + 1));
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                result.append(ch).append(frequencyMap.get(ch));
                frequencyMap.remove(ch); // Prevent duplicate characters in result
            }
        }
        System.out.println("result = " + result);
        return result.toString();
       
    }
    }



