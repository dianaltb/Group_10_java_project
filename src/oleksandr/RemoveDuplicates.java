package oleksandr;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AAABBBCCC";

        String unique = removeDuplicates(str);
        System.out.println("unique = " + unique);


    }

    public static String removeDuplicates(String str) {

        Set<Character> unique = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char each : str.toCharArray()) {
            unique.add(each);
        }

        for (Character each : unique) {
            sb.append(each);
        }

        return sb.toString();
    }
}
