package niloo;

/*
   Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF"
    */

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindUniques {

    public static void main(String[] args) {
        findUniqueChars("AAABBBCCCDEF");//#1
        System.out.println("findUniqueChars = " + findUniqueChars("AAABBBCCCDEF"));
        findUniques("AAABBBCCCDEF"); //#2
        System.out.println("findUniques = " + findUniques("AAABBBCCCDEF"));
    }

    //#1- Using string builder and loop

    public static String findUniqueChars(String str) {

        StringBuilder uniqueChars = new StringBuilder();

        //str.indexOf(ch)--> the index of the first occurrence.
        //str.lastIndexOf(ch)--> the index of the last occurrence.
        //If both are equal, it means the character appears only once.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                uniqueChars.append(ch);
            }
        }
        return uniqueChars.toString();
    }
    //#2- Using Map and string builder, loop
   public static String findUniques(String str){

           Map<Character, Integer> charCount = new LinkedHashMap<>();

           // Count each character
           for (char ch : str.toCharArray()) {
               charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
           }

           // Build uniques from characters that appear only once
           StringBuilder uniques = new StringBuilder();
           for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
               if (entry.getValue() == 1) {
                   uniques.append(entry.getKey());
               }
           }
           return uniques.toString();
       }
}
