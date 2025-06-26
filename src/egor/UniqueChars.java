package egor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueChars {
    public static void main(String[] args) {

        System.out.println("IntStream + Stream: " + uniqueStream("AAABBBCCCDEF"));
        System.out.println("======================");
        System.out.println("Two loops + concat: " + uniqueLoop("AAABBBCCCDEF"));
        System.out.println("======================");
        System.out.println("Indexes: " + getUnique("AAABBBCCCDEF"));
        /*
        IntStream + Stream: DEF
        ======================
        Two loops + concat: DEF
         */
    }

    private static String uniqueStream(String str) {
        List<Character> list = str.chars()
                .mapToObj(c -> (char) c)
                .toList();

        return list.stream()
                .filter(c -> Collections.frequency(list, c ) == 1)
                .collect(StringBuilder::new,
                        (sb, c) -> sb.append((char) c),
                        StringBuilder::append)
                .toString();
    }

    private static String uniqueLoop(String str){
        List<Character> list = new ArrayList<>();
        for(char ch : str.toCharArray()){
            list.add(ch);
        }
        list.removeIf(c -> Collections.frequency(list, c) != 1);
        String result = "";
        for(char ch : list){
            result += ch;
        }
        return result;
    }

    private static String getUnique(String str){
        String result = "";
        for(char ch : str.toCharArray()){
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }
        }
        return result;
    }
}
