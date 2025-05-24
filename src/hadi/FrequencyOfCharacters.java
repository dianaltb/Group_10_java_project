package hadi;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    // Write a return method that can find the frequency of characters
    // Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {

        String input = "AAABBCDD";
        System.out.println(frequencyOfChars(input));
        System.out.println(frequencyOfChars2(input));

    }

    // Solution #1 using nested loop
    public static String frequencyOfChars(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if(result.contains(String.valueOf(currentChar))){
                continue;
            }

            int count = 0;
            for (int j = 0 ; j < str.length(); j++){
                if (str.charAt(j) == currentChar){
                    count++;
                }
            }
            result += currentChar + String.valueOf(count);
        }
        return result;
    }


    //Solution #2 using LinkedHashMap
    public static String frequencyOfChars2(String str){

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()){
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()){
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }


}
