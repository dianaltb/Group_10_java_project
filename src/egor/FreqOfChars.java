package egor;

import java.util.*;

public class FreqOfChars {
    public static void main(String[] args) {

        System.out.println("Frequency of AAABBCDD is: " + freqOfChars("AAABBCDD"));
        //Frequency of AAABBCDD is: A3B2C1D2

    }

    private static String freqOfChars(String str){
        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list= str.chars()
                .mapToObj(c -> (char) c)
                .toList();
        for(char ch : list){
            map.putIfAbsent(ch, Collections.frequency(list, ch));

        }
        for(char key : map.keySet()){
            builder.append(key).append(map.get(key));
        }
        return builder.toString();
    }
}
