package kseniia;

import java.util.HashMap;

/*
Java Question 05 - Frequency of Characters
      Write a return method that can find the frequency of characters
         Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */


    public class FrequencyOfChars {

        public static String frequencyOfChars(String str) {
            HashMap<Character, Integer> charCountMap = new HashMap<>();
            for (char c : str.toCharArray()) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
            StringBuilder result = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (charCountMap.containsKey(c)) {
                    result.append(c).append(charCountMap.get(c));
                    charCountMap.remove(c);
                }
            }
            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(frequencyOfChars("AAABBCDD"));
        }
    }

